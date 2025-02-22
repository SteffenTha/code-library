package com.example.observer.propertyChangeListener.anzeigen;


import com.example.observer.custom.anzeigen.AnzeigeElement;
import com.example.observer.propertyChangeListener.WetterDatenPlc;
import com.example.observer.propertyChangeListener.WetterDatenSender;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Statistik implements AnzeigeElement, PropertyChangeListener {
    private float temperatur;
    private float luftfeuchtigkeit;
    private float luftdruck;
    public WetterDatenSender wetterDatenSender;

    public Statistik(WetterDatenSender sender) {
        this.wetterDatenSender = sender;
        this.wetterDatenSender.anzeigeHinzufuegen(this);
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

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        WetterDatenPlc wetterDaten = (WetterDatenPlc) evt.getNewValue();
        this.temperatur = wetterDaten.getTemperatur();
        this.luftdruck = wetterDaten.getLuftdruck();
        this.luftfeuchtigkeit = wetterDaten.getLuftfeuchtigkeit();
        anzeigen();
    }
}
