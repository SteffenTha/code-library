package com.example.command.fernbedienung;

import com.example.command.Befehle.Befehl;

public class EinfacheFernsteuerung {

    private Befehl platz;

    public EinfacheFernsteuerung() {
    }

    public void knopfGedrueckt() {
        this.platz.ausfuehren();
    }

    public void setPlatz(Befehl platz) {
        this.platz = platz;
    }
}
