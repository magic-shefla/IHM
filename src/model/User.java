package model;

public class User {
    private String firstName;
    private String lastName;

    private String phoneNbr;
    private String Address;


    public User(String firstName, String lastName, String phoneNbr, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNbr = phoneNbr;
        Address = address;
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

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNbr='" + phoneNbr + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

}

