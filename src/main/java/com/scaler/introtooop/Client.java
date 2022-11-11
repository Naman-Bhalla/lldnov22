package com.scaler.introtooop;

public class Client {

    public static void main(String[] args) {
        // int a = 2;
        // [DataType] [variableName] = [intialValue]

        Student kartik = new Student();
        kartik.age = 25;

        Student naveen = new Student();
        naveen.age = 26;
        naveen.batch = "Nov 21 Advanced";
        naveen.changeBatch("Jan 22");
    }
}
