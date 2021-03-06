package com.kodilla.good.patterns.challenges.ordering.system;

public class User {

    private String number;
    private String name;
    private String surname;
    private String email;

    public User(String number, String name, String surname, String email) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}
