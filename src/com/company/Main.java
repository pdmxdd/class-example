package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person me = new Person("Paul", "Matthews", 32);
        System.out.println(me); // not helpful
        System.out.println(me.firstName);
        System.out.println(me.lastName);
        System.out.println(me.printFullName());
        System.out.println(me.printInitials());
    }
}
