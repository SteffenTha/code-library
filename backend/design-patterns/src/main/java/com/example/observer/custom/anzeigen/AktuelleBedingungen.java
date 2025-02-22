package com.example.observer.custom.anzeigen;


import com.example.observer.custom.Beobachter;
import com.example.observer.custom.Subjekt;

public class AktuelleBedingungen implements Beobachter, AnzeigeElement {
    private float temperatur;
    private float luftfeuchtigkeit;
    private float luftdruck;
    public Subjekt wetterDaten;

    public AktuelleBedingungen(Subjekt wetterDaten) {
        this.wetterDaten = wetterDaten;
        this.wetterDaten.registriereBeobachter(this);
    }

    @Override
    public void aktualisieren(float temp, float humid, float pressure) {
        temperatur = temp;
        luftfeuchtigkeit = humid;
        luftdruck = pressure;
        anzeigen();
    }

    @Override
    public void anzeigen() {
        System.out.println(":::: Aktuelle Wetterbedingungen ::::");
        System.out.println(String.format("Temperatur:  %s°C", temperatur));
        System.out.println(String.format("Luftfeuchtigkeit (in Prozent): %s", luftfeuchtigkeit));
        System.out.println(String.format("Luftdruck: %s", luftdruck));
        System.out.println("\n");
    }
}
