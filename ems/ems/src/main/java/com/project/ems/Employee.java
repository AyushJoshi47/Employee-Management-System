package com.project.ems;


import jakarta.persistence.*;

@Entity
@Table(name = "employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeid;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String department;
    private String address;
    private String maritalstatus;
    private String gender;
    private String nationality;
    private String dateofbirth;
    private String jobtitle;
    private String dateofhire;


    public Integer getEmployeeid()
    {
        return employeeid;
    }
    public void setEmployeeid(Integer employeeid){
        this.employeeid = employeeid;
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
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }
    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getDateofbirth() {
        return dateofbirth;
    }
    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    public String getJobtitle() {
        return jobtitle;
    }
    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }
    public String getDateofhire() {
        return dateofhire;
    }
    public void setDateofhire(String dateofhire) {
        this.dateofhire = dateofhire;
    }

}
