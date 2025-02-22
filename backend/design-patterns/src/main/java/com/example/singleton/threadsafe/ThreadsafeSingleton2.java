package com.example.singleton.threadsafe;

public class ThreadsafeSingleton2 {
    private static ThreadsafeSingleton2 einzigeInstanz = new ThreadsafeSingleton2();

    private ThreadsafeSingleton2() {}

    public static ThreadsafeSingleton2 getInstance() {
        return einzigeInstanz;
    }
}
