package com.s2pedutech.Alumini.entity;


import jakarta.persistence.*;



@Entity
@Table(name = "aluminiDetails")
public class AluminiDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String yearOfPassout;
    private String highestQualification;
    private String specialization;
    private String collegeName;
    private boolean married;
    private String contactNumber;
    private String address;
    private boolean gender; // true for male, false for female
    private String description;
    private String profession;
    private String city;
    private String state;
    private String country;
    private String imageUrl;

    public AluminiDetails() {
    }

    public AluminiDetails(long id, String yearOfPassout, String highestQualification, String specialization, String collegeName, boolean married, String contactNumber, String address, boolean gender, String description, String profession, String city, String state, String country, String imageUrl) {
        this.id = id;
        this.yearOfPassout = yearOfPassout;
        this.highestQualification = highestQualification;
        this.specialization = specialization;
        this.collegeName = collegeName;
        this.married = married;
        this.contactNumber = contactNumber;
        this.address = address;
        this.gender = gender;
        this.description = description;
        this.profession = profession;
        this.city = city;
        this.state = state;
        this.country = country;
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHighestQualification() {
        return highestQualification;
    }

    public void setHighestQualification(String highestQualification) {
        this.highestQualification = highestQualification;
    }

    public String getYearOfPassout() {
        return yearOfPassout;
    }

    public void setYearOfPassout(String yearOfPassout) {
        this.yearOfPassout = yearOfPassout;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
