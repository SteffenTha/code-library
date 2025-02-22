package com.example.observer.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WetterDaten implements Subjekt {
    private float temperatur;
    private float luftfeuchtigkeit;
    private float luftdruck;
    private List<Beobachter> beobachter;

    public WetterDaten() {
        this.beobachter = new ArrayList();
    }

    private float getTemperatur() {
        return generateRandomNumber(-20, 40);
    }

    private float getLuftfeuchtigkeit() {
        return generateRandomNumber(10, 100);
    }

    private float getLuftdruck() {
        return generateRandomNumber(950, 1060);
    }

    private float generateRandomNumber(float lowerBound, float upperBound) {
        return new Random().nextFloat(upperBound - lowerBound) + lowerBound;
    }

    public void messwerteGeaendert() {
        this.temperatur = getTemperatur();
        this.luftfeuchtigkeit = getLuftfeuchtigkeit();
        this.luftdruck = getLuftdruck();
        aktualisiereBeobachter();
    }

    @Override
    public void registriereBeobachter(Beobachter beobachter) {
        this.beobachter.add(beobachter);
    }

    @Override
    public void entferneBeobachter(Beobachter beobachter) {
        this.beobachter.remove(beobachter);
    }

    @Override
    public void aktualisiereBeobachter() {
        beobachter.forEach(b -> b.aktualisieren(temperatur, luftfeuchtigkeit, luftdruck));
    }
}
