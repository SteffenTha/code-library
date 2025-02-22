package com.example.command.Befehle.ventilator;

import com.example.command.haushaltsgeraete.Ventilator;

public class VentilatorRueckgaengigHelper {

    public static void rueckgaengigAusfuehren(int letzteGeschwindigkeit, Ventilator ventilator) {
        if (letzteGeschwindigkeit == Ventilator.SCHNELL) {
            ventilator.schnell();
        } else if (letzteGeschwindigkeit == Ventilator.MITTEL) {
            ventilator.mittel();
        } else if (letzteGeschwindigkeit == Ventilator.LANGSAM) {
            ventilator.langsam();
        } else if (letzteGeschwindigkeit == Ventilator.AUS) {
            ventilator.aus();
        }
    }
}
