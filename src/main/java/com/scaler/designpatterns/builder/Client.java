package com.scaler.designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        Student s = Student.getBuilder()
                .setAge(24)
                .setName("Naman")
                .setPsp(90)
                .build();

//        Student s = builder.build();

        // Student s = Student.getBuilder()
        //                    .setName(Naman)
        //                    .setAge(24)
        //                    .build();
    }
}
