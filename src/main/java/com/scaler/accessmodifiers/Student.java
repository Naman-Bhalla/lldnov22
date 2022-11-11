package com.scaler.accessmodifiers;

public class Student {
    private int id;
    String name; // not in other client
    protected String gender; // not in other client
    public int age; // visible
    public String batch; // visible

    public void changeBatch(String newBatch) {
        batch = newBatch;
    }


    private void pauseCourse(int duration) {
        id = 123;
        batch = null;
        System.out.println("Paused the course");
    }
}
