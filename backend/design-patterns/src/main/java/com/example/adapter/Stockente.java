package com.example.adapter;

public class Stockente implements Ente {

    @Override
    public void quacken() {
        System.out.println("Quack");
    }

    @Override
    public void fliegen() {
        System.out.println("Ich fliege");
    }
}
