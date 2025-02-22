package com.example.facade;

public class Beleuchtung {

    void dimmen(int helligkeit) {
        System.out.println("Kinobeleuchtung gedimmt auf " + helligkeit + "%");
    }

    void ein() {
        System.out.println("Kinobeleuchtung an");
    }
}
