package com.example.lambdas;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Functional Interface = Interface with a single (abstract) method

        // Example 1
        MyFuncInterface myFuncInterface = () -> System.out.println("===> Test 1");
        myFuncInterface.show();

        // Example 2
        onTheFly(() -> System.out.println("===> Test 2"));
    }

    public static void onTheFly(MyFuncInterface myFuncInterface) {
        myFuncInterface.show();
    }
}
