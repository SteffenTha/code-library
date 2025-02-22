package com.example.observer.propertyChangeListener;

public class WetterDatenPlc {
    private float temperatur;
    private float luftfeuchtigkeit;
    private float luftdruck;

    public WetterDatenPlc(float temperatur, float luftfeuchtigkeit, float luftdruck) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.luftdruck = luftdruck;
    }

    public float getTemperatur() {
        return temperatur;
    }

    public float getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public float getLuftdruck() {
        return luftdruck;
    }
}
