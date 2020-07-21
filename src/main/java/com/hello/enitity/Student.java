package com.hello.enitity;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.*;

@Entity
@Table
@ManagedBean
@SessionScoped
public class Student {
    @Id
    @Column
    private long id;
    private String rollNumber;
    private String firstName;
    private String lastName;
    private int gender;

    // checkboxes
    private String favourites;
    // checkboxes
    private String sports;

    private String address;

    // dropdownlist
    private String city;
    private long createdAt;
    private long updatedAt;

    // dropdownlist : 1 active; 0 deactive;
    private int status;

    public Student() {
    }

    public Student(long id, String rollNumber, String firstName, String lastName, int gender, String favourites, String sports, String address, String city, long createdAt, long updatedAt, int status) {
        this.id = id;
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.favourites = favourites;
        this.sports = sports;
        this.address = address;
        this.city = city;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }

    public Student(long id, String rollNumber, String firstName, String lastName) {
        this.id = id;
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getFavourites() {
        return favourites;
    }

    public void setFavourites(String favorites) {
        this.favourites = favorites;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Transient
    public String getGenderString() {

        return this.gender == 1 ? "Male" : this.gender == 0 ? "Female" : "Other";
    }

    @Transient
    public String getStatusName() {

        return status == 1 ? "Active" : status == 0 ? "Deactive" : "Deleted";
    }
}
