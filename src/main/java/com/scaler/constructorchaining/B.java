package com.scaler.constructorchaining;

public class B extends A {

    public B(int n) {
        for (int i = 0; i < n; ++i) {
            System.out.println("B Constructor");
        }
    }
}
