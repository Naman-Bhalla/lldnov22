package com.scaler.constructorchaining;

public class C extends B {

//    public C() {
//        System.out.println("C constructor");
//    }

    public C(String something) {
        super(3);
        System.out.println(something);
    }
}
