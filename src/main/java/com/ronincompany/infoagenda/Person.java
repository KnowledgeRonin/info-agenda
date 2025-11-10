package com.ronincompany.infoagenda;

public class Person {
    
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String birthDate;
    private String imagePath;
    
    public Person (String id, String firstName, String lastName, String address, String phone, String birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
    }
    
    public Person() {
        
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthDate() {
        return birthDate;
    }
    
    public String getImagePath() {
        return imagePath;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthdate(String birthdate) {
        this.birthDate = birthdate;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
}
