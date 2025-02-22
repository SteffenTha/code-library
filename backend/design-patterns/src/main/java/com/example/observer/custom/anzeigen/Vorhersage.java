package com.example.observer.custom.anzeigen;


import com.example.observer.custom.Beobachter;
import com.example.observer.custom.Subjekt;

public class Vorhersage implements Beobachter, AnzeigeElement {
    private float luftdruck;
    private Subjekt wetterDaten;

    public Vorhersage(Subjekt wetterDaten) {
        this.wetterDaten = wetterDaten;
        this.wetterDaten.registriereBeobachter(this);
    }

    @Override
    public void aktualisieren(float temp, float humid, float pressure) {
        this.luftdruck = pressure;
        anzeigen();
    }

    @Override
    public void anzeigen() {
        System.out.println(":::: Wettervorhersage ::::");
        if (luftdruck > 1000) {
            System.out.println("Morgen gibt es schönes Wetter");
        } else {
            System.out.println("Morgen gibt es schlechtes Wetter");
        }
        System.out.println("\n");
    }
}
