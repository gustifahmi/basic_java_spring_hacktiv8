package com.belajar.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private int age;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "student_courses", joinColumns = {
			@JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false, updatable = false)},
			inverseJoinColumns = {@JoinColumn(name = "course_id", referencedColumnName = "id",
			nullable = false, updatable = false)
			}
	)
	private Set<Course> course = new HashSet<>();
	
	public Student() {
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Set<Course> getCourse() {
		return course;
	}

	public String toString() {
		return "Student{" + "id=" + id + ", name=" + name +
				", age=" + age + ", course=" + course + "}";
	}
}
