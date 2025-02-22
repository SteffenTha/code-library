package com.example.singleton.threadsafe;

public class ThreadsafeSingleton3 {
    private volatile static ThreadsafeSingleton3 einzigeInstanz;

    private ThreadsafeSingleton3() {}

    public static ThreadsafeSingleton3 getInstance() {
        if (einzigeInstanz == null) {
            synchronized (ThreadsafeSingleton3.class) {
                einzigeInstanz = new ThreadsafeSingleton3();
            }
        }
        return einzigeInstanz;
    }
}
