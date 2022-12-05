package com.scaler.designpatterns.builder;

public class Student {
    private String name;
    private int age;
    private String university;
    private String batch;
    private double psp;
    private String email;

    private Student(Builder b) {
        // validate(b);
        this.psp = b.psp;
        this.name = b.name;
        // .....
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private String university;
        private String batch;
        private double psp;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        boolean validate() {
            if (this.age < 18) {
                return false;
            }

            if (2000 + this.age > 2025) {
                return false;
            }

            return true;
        }
        public Student build() {
            if (!validate()) {
                throw  new RuntimeException();
            }
            return new Student(this);
        }
    }
}
