package com.bridgelabz.addressBook;

public class Contacts {
    //declaring the variables needed and making them private
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNum;
    private String email;


    public String getFirstName() {   //taking the value from the variable using getter
        return firstName;
    }
    public void setFirstName(String firstName) {   //assigning value to the variable using setter
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contacts [First Name = " + firstName + ", Last Name = " + lastName + ", Address = " + address + ", City = " + city
                + ", State = " + state + ", Zip = " + zip + ", Phone Number = " + phoneNum + ", Email Id = " + email + "] \n";
    }

}
