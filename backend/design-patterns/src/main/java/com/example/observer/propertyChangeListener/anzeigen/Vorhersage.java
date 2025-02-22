package com.example.observer.propertyChangeListener.anzeigen;


import com.example.observer.custom.anzeigen.AnzeigeElement;
import com.example.observer.propertyChangeListener.WetterDatenPlc;
import com.example.observer.propertyChangeListener.WetterDatenSender;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Vorhersage implements AnzeigeElement, PropertyChangeListener {
    private float luftdruck;
    public WetterDatenSender wetterDatenSender;

    public Vorhersage(WetterDatenSender sender) {
        this.wetterDatenSender = sender;
        this.wetterDatenSender.anzeigeHinzufuegen(this);
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

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        WetterDatenPlc wetterDaten = (WetterDatenPlc) evt.getNewValue();
        this.luftdruck = wetterDaten.getLuftdruck();
        anzeigen();
    }
}
