package com.learning.xml.challenge1;

public class User {
    //Private attribute
    private int id;
    private String firstname;
    private String lastname;

    //Constructor
    User() {
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //Getter
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(id).append(": ")
            .append("").append(firstname).append(" ")
            .append("").append(lastname);

        return builder.toString();
    }
}
