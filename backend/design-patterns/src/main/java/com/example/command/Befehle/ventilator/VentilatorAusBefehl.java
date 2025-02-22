package com.example.command.Befehle.ventilator;

import com.example.command.Befehle.Befehl;
import com.example.command.haushaltsgeraete.Ventilator;

public class VentilatorAusBefehl implements Befehl {
    Ventilator ventilator;
    int letzteGeschwindigkeit;

    public VentilatorAusBefehl(Ventilator ventilator) {
        this.ventilator = ventilator;
    }

    @Override
    public void ausfuehren() {
        letzteGeschwindigkeit = ventilator.getGeschwindigkeit();
        ventilator.aus();
    }

    @Override
    public void rueckgaengig() {
        VentilatorRueckgaengigHelper.rueckgaengigAusfuehren(letzteGeschwindigkeit, ventilator);
    }

}
