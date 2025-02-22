package com.example.observer.propertyChangeListener.anzeigen;


import com.example.observer.custom.anzeigen.AnzeigeElement;
import com.example.observer.propertyChangeListener.WetterDatenPlc;
import com.example.observer.propertyChangeListener.WetterDatenSender;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class AktuelleBedingungen implements AnzeigeElement, PropertyChangeListener {
    private float temperatur;
    private float luftfeuchtigkeit;
    private float luftdruck;
    public WetterDatenSender wetterDatenSender;

    public AktuelleBedingungen(WetterDatenSender sender) {
        this.wetterDatenSender = sender;
        this.wetterDatenSender.anzeigeHinzufuegen(this);
    }

    @Override
    public void anzeigen() {
        System.out.println(":::: Aktuelle Wetterbedingungen ::::");
        System.out.println(String.format("Temperatur:  %s°C", temperatur));
        System.out.println(String.format("Luftfeuchtigkeit (in Prozent): %s", luftfeuchtigkeit));
        System.out.println(String.format("Luftdruck: %s", luftdruck));
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
