package com.LiuMeng.model;

import java.util.Date;

public class User {
    private int id;
    private String usernamne;
    private String password;
    private String email;
    private String gender;
    private java.util.Date birthdate;

    public User(){

    }

    public User(int id, String usernamne, String password, String email, String gender, Date birthdate) {
        this.id = id;
        this.usernamne = usernamne;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsernamne() {
        return usernamne;
    }

    public void setUsernamne(String usernamne) {
        this.usernamne = usernamne;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usernamne='" + usernamne + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}