package com.scaler.polymorphism;

import com.scaler.inheritance.Student;
import com.scaler.inheritance.User;

public class Client {

    public static void main(String[] args) {
        User u = new Student();

//        u.setPsp();

        u.changePassword("hello");
    }
}
