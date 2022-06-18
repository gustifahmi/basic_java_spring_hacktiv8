package com.learning.xml.dom;

public class Employee {
    //Private attribute
    private Integer id;
    private String firstName;
    private String lastName;
    private String location;

    //Setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //Getter
    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return ("Employee [id = " + id + ", firstName = " + firstName +
            ", lastName = " + lastName + ", location = " + location + "]");
    }
}
