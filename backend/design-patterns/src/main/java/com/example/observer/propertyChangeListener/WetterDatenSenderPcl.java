package com.example.observer.propertyChangeListener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;

public class WetterDatenSenderPcl implements WetterDatenSender{
    private WetterDatenPlc wetterDaten;
    private PropertyChangeSupport support;

    public WetterDatenSenderPcl() {
        support = new PropertyChangeSupport(this);
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
        WetterDatenPlc daten = new WetterDatenPlc(getTemperatur(), getLuftfeuchtigkeit(), getLuftdruck());
        support.firePropertyChange("wetterDaten", this.wetterDaten ,daten);
        this.wetterDaten = daten;
    }

    @Override
    public void anzeigeHinzufuegen(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    @Override
    public void anzeigeEntfernen(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}
