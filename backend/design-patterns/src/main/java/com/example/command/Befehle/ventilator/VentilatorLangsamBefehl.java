package com.example.command.Befehle.ventilator;

import com.example.command.Befehle.Befehl;
import com.example.command.haushaltsgeraete.Ventilator;

public class VentilatorLangsamBefehl implements Befehl {
    Ventilator ventilator;
    int letzteGeschwindigkeit;

    public VentilatorLangsamBefehl(Ventilator ventilator) {
        this.ventilator = ventilator;
    }

    @Override
    public void ausfuehren() {
        letzteGeschwindigkeit = ventilator.getGeschwindigkeit();
        ventilator.langsam();
    }

    @Override
    public void rueckgaengig() {
        VentilatorRueckgaengigHelper.rueckgaengigAusfuehren(letzteGeschwindigkeit, ventilator);
    }

}
