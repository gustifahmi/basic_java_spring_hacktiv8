package com.learning.xml.sax;

public class User {
    //Private attribute
    private int id;
    private String name;
    private String gender;
    private String role;

    //Constructor
    User() {
    }

    //Setter
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //Getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User{").append("id = ").append(id)
            .append(", Name = ").append(name)
            .append(", Gender = ").append(gender)
            .append(", Role = ").append(role).append("}");

        return builder.toString();
    }
}
