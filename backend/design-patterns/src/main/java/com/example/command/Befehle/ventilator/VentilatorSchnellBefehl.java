package com.example.command.Befehle.ventilator;

import com.example.command.Befehle.Befehl;
import com.example.command.haushaltsgeraete.Ventilator;

public class VentilatorSchnellBefehl implements Befehl {
    Ventilator ventilator;
    int letzteGeschwindigkeit;

    public VentilatorSchnellBefehl(Ventilator ventilator) {
        this.ventilator = ventilator;
    }

    @Override
    public void ausfuehren() {
        letzteGeschwindigkeit = ventilator.getGeschwindigkeit();
        ventilator.schnell();
    }

    @Override
    public void rueckgaengig() {
        VentilatorRueckgaengigHelper.rueckgaengigAusfuehren(letzteGeschwindigkeit, ventilator);
    }

}
