package com.scaler.accessmodifiershelper;

import com.scaler.accessmodifiers.Student;

public class StudentChild extends Student  {

    void doSomething() {
        age = 12;
        gender = "Male";
//        name = "Naman" Default access modifier is not visible
    }

    void doSomething2() {
        Student st = new Student();
        st.batch = "ABC"; // Only public are going to be visible
        // because if child tries to access attributes of a parent
        // via an object of it, they are considered a third party code
    }
}
