package com.project.ems;


import jakarta.persistence.*;

@Entity
@Table(name = "trainee")

public class Trainee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serialnumber;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;


    public Integer getSerialnumber() {
        return serialnumber;
    }

    public void getSerialnumber(Integer serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getFirstname() {
        return firstname;

    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;

    }

    public String getLastname() {
        return lastname;

    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}