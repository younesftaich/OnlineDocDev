package com.mouatamid.onlinedocdev.models;

public class Doctor {
    private String firstName;
    private String lastName;
    private String speciality;
    private String address;
    private String availability;

    public Doctor() {
    }

    public Doctor(String firstName, String lastName, String speciality, String address, String availability) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.address = address;
        this.availability = availability;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", speciality='" + speciality + '\'' +
                ", address='" + address + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }
}
