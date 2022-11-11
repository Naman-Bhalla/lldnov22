package com.scaler.constructors;

import com.scaler.accessmodifiers.Student;

public class Client {

    public static void main(String[] args) {
        Student st = new Student();

        StudentA sta = new StudentA();
        StudentA sta1 = new StudentA();

//        StudentB stb = new StudentB();
            StudentB stb1 = new StudentB("Naman", "male");
            StudentB stb2 = new StudentB("ujjwal", "male");
    }
}
