package crud.task2.models;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
    private long id;
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;


    public Customer() {
    }

    public Customer(long id, String fullName, String email, LocalDate dateOfBirth, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "\n Id: " + id + '\n' +
                "FullName: " + fullName + '\n' +
                "Email: " + email + '\n' +
                "DateOfBirth: " + dateOfBirth + '\n' +
                "PhoneNumber: " + phoneNumber;
    }
}
