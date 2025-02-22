package com.example.observer.custom.anzeigen;


import com.example.observer.custom.Beobachter;
import com.example.observer.custom.Subjekt;

public class Statistik implements Beobachter, AnzeigeElement {
    private float temperatur;
    private float luftfeuchtigkeit;
    private float luftdruck;
    private Subjekt wetterDaten;

    public Statistik(Subjekt wetterDaten) {
        this.wetterDaten = wetterDaten;
        this.wetterDaten.registriereBeobachter(this);
    }

    @Override
    public void aktualisieren(float temp, float humid, float pressure) {
        this.temperatur = temp;
        this.luftfeuchtigkeit = humid;
        this.luftdruck = pressure;
        anzeigen();
    }

    @Override
    public void anzeigen() {
        float minTemp = temperatur - 5;
        float maxTemp = temperatur + 5;
        float minHumid = Math.max(0, luftfeuchtigkeit - 10);
        float maxHumid = Math.min(100, luftfeuchtigkeit + 10);
        float minPress = luftdruck - 20;
        float maxPress = luftdruck + 20;

        System.out.println(":::: Wetterstatistik ::::");
        System.out.println(String.format("Temperatur: Min: %s°C, Max: %s°C", minTemp, maxTemp));
        System.out.println(String.format("Luftfeuchtigkeit (in Prozent): Min: %s, Max: %s", minHumid, maxHumid));
        System.out.println(String.format("Luftdruck: Min: %s, Max: %s", minPress, maxPress));
        System.out.println("\n");
    }
}
