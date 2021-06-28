package com.company;

public class Person {

    // so this is different for our class we must first initialize the properties before setting them in our constructor
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String printFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String printInitials() {
        return this.firstName.substring(0, 1) + "." + this.lastName.substring(0, 1) + ".";
    }

}
