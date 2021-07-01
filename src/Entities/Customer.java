package Entities;

import java.time.LocalDate;

public class Customer {
    int id;
    String firstName;
    String lastname;
    LocalDate dateOfBirth;
    String nationalityID;

    public Customer(int id, String firstName, String lastname, LocalDate dateOfBirth, String nationalityID) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.nationalityID = nationalityID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityID() {
        return nationalityID;
    }

    public void setNationalityID(String nationalityID) {
        this.nationalityID = nationalityID;
    }
}
