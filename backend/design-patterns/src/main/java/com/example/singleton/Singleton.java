package com.example.singleton;

public class Singleton {
    private static Singleton einzigeInstanz;

    private Singleton() {}

    public static Singleton getInstance() {
        if (einzigeInstanz == null) {
            einzigeInstanz = new Singleton();
        }
        return einzigeInstanz;
    }
}
