package com.example.singleton.threadsafe;

public class ThreadsafeSingleton1 {
    private static ThreadsafeSingleton1 einzigeInstanz;

    private ThreadsafeSingleton1() {}

    public static synchronized ThreadsafeSingleton1 getInstance() {
        if (einzigeInstanz == null) {
            einzigeInstanz = new ThreadsafeSingleton1();
        }
        return einzigeInstanz;
    }
}
