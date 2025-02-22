package com.example.observer.custom;

public interface Subjekt {

    void registriereBeobachter(Beobachter beobachter);
    void entferneBeobachter(Beobachter beobachter);
    void aktualisiereBeobachter();
}
