CREATE TABLE tb_employee(
    ssn int PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    middle_name VARCHAR(255),
    last_name VARCHAR(255) NOT NULL,
    birthdate DATE NOT NULL,
    join_date DATE NOT NULL,
    address VARCHAR(255) NOT NULL,
    sex ENUM('M', 'F') NOT NULL,
    salary int NOT NULL,
    dept_number int NOT NULL
);

CREATE TABLE tb_department(
    dept_number int PRIMARY KEY AUTO_INCREMENT,
    dept_name VARCHAR(255) NOT NULL,
    manager_ssn int,
    FOREIGN KEY(manager_ssn) REFERENCES tb_employee(ssn)
);

ALTER TABLE tb_employee
ADD FOREIGN KEY(dept_number) REFERENCES tb_department(dept_number);

CREATE TABLE tb_dept_location(
    id_dept_location int PRIMARY KEY AUTO_INCREMENT,
    dept_number int NOT NULL,
    dept_location VARCHAR(255) NOT NULL,
    FOREIGN KEY(dept_number) REFERENCES tb_department(dept_number)
);

CREATE TABLE tb_project(
    project_number int PRIMARY KEY AUTO_INCREMENT,
    project_name VARCHAR(255) NOT NULL,
    project_location VARCHAR(255) NOT NULL,
    dept_number int NOT NULL,
    FOREIGN KEY(dept_number) REFERENCES tb_department(dept_number)
);

CREATE TABLE tb_works_on(
    id_works_on int PRIMARY KEY AUTO_INCREMENT,
    employee_ssn int NOT NULL,
    project_number int NOT NULL,
    hours int NOT NULL,
    FOREIGN KEY(employee_ssn) REFERENCES tb_employee(ssn),
    FOREIGN KEY(project_number) REFERENCES tb_project(project_number)
);

CREATE TABLE tb_dependent(
    id_dependent int PRIMARY KEY AUTO_INCREMENT,
    employee_ssn int NOT NULL,
    dependent_name VARCHAR(255) NOT NULL,
    sex ENUM('M', 'F') NOT NULL,
    birthdate DATE NOT NULL,
    relationship VARCHAR(255) NOT NULL,
    FOREIGN KEY(employee_ssn) REFERENCES tb_employee(ssn)
);

--View a
CREATE VIEW employee_r AS
SELECT d.dependent_name, d.relationship, e.first_name AS employee_first_name
FROM tb_employee e
JOIN tb_dependent d
ON e.ssn = d.employee_ssn
WHERE e.first_name LIKE 'R%';

--View b
CREATE VIEW employee_pnum_1 AS
SELECT e.first_name, e.middle_name, e.last_name, p.project_name
FROM tb_employee e
JOIN tb_works_on wo
ON e.ssn = wo.employee_ssn
JOIN tb_project p
ON p.project_number = wo.project_number
WHERE wo.project_number = 1;

--View c
CREATE VIEW number_of_employee_salary_3500000 AS
SELECT COUNT(*) AS number_of_employee
FROM tb_employee e
WHERE e.salary > 3500000;

--View d
CREATE VIEW number_of_project_dnum_2 AS
SELECT COUNT(*) AS number_of_project
FROM tb_project p
JOIN tb_department d
ON p.dept_number = d.dept_number
WHERE p.dept_number = 2;

--View e
CREATE VIEW salary_per_department AS
SELECT e.dept_number, d.dept_name, SUM(e.salary) AS total_salary, FLOOR(AVG(e.salary)) AS average_salary
FROM tb_employee e
JOIN tb_department d
ON e.dept_number = d.dept_number
GROUP BY e.dept_number;

--View f
CREATE VIEW number_of_employee_per_department AS
SELECT d.dept_name, COUNT(*) AS number_of_employee
FROM tb_employee e
JOIN tb_department d
ON e.dept_number = d.dept_number
GROUP BY e.dept_number
ORDER BY number_of_employee DESC;

--View g
CREATE VIEW total_hours_per_project AS
SELECT p.project_name, SUM(wo.hours) AS total_hours
FROM tb_employee e
JOIN tb_works_on wo
ON e.ssn = wo.employee_ssn
JOIN tb_project p
ON p.project_number = wo.project_number
GROUP BY wo.project_number;

--View h
CREATE VIEW 140_hours_per_week AS
SELECT wo.employee_ssn, e.first_name, e.middle_name, e.last_name, SUM(wo.hours) AS total_employee_hours
FROM tb_employee e
JOIN tb_works_on wo
ON e.ssn = wo.employee_ssn
GROUP BY wo.employee_ssn
HAVING total_employee_hours > 140
ORDER BY total_employee_hours DESC;

--View i
CREATE VIEW employee_bonus AS
SELECT e.first_name, e.middle_name, e.last_name, SUM(wo.hours) AS total_employee_hours, 
CASE
WHEN SUM(wo.hours) >= 200 THEN '50%'
WHEN SUM(wo.hours) >= 150 THEN '25%'
ELSE '10%'
END AS bonus_percentage,
CASE
WHEN SUM(wo.hours) >= 200 THEN (50 * e.salary / 100) 
WHEN SUM(wo.hours) >= 150 THEN (25 * e.salary / 100)
ELSE (10 * e.salary / 100)
END AS bonus
FROM tb_employee e
JOIN tb_works_on wo
ON e.ssn = wo.employee_ssn
GROUP BY wo.employee_ssn;

--View j
CREATE VIEW number_of_project_per_employee AS
SELECT e.first_name, e.middle_name, e.last_name, COUNT(wo.project_number) AS number_of_project
FROM tb_employee e
JOIN tb_works_on wo
ON e.ssn = wo.employee_ssn
GROUP BY wo.employee_ssn
ORDER BY COUNT(wo.project_number) DESC;

--View k
CREATE VIEW employee_with_4_projects AS
SELECT e.first_name, e.middle_name, e.last_name, COUNT(wo.project_number) AS number_of_project
FROM tb_employee e
JOIN tb_works_on wo
ON e.ssn = wo.employee_ssn
GROUP BY wo.employee_ssn
HAVING number_of_project = 4;

--View l


--View m
CREATE VIEW number_of_relationship AS
SELECT d.relationship, COUNT(d.relationship) AS count
FROM tb_dependent d
GROUP BY d.relationship
ORDER BY count DESC;

--View n
CREATE VIEW manager_joined_since AS
SELECT e.first_name, e.middle_name, e.last_name, 
CONCAT(
    TIMESTAMPDIFF(YEAR, e.join_date, now()), ' Years ',
    MOD(TIMESTAMPDIFF(MONTH, e.join_date, now()), 12), ' Months'
) AS joined_since
FROM tb_employee e
JOIN tb_department d
ON e.ssn = d.manager_ssn;

--View o
CREATE VIEW project_location_with_multiple_department AS
SELECT p.project_location, COUNT(DISTINCT p.dept_number) as count_department
FROM tb_project p
JOIN tb_department d
ON p.dept_number = d.dept_number
GROUP BY p.project_location
HAVING count_department > 1
ORDER BY count_department DESC;