package com.scaler.accessmodifiershelper;

import com.scaler.accessmodifiers.Student;

public class Client {

    public static void main(String[] args) {
        Student st = new Student();
        st.age = 12;
        st.batch = "hello";
    }
}
