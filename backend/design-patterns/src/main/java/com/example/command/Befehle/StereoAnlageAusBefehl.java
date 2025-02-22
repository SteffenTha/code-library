package com.example.command.Befehle;


import com.example.command.haushaltsgeraete.StereoAnlage;

public class StereoAnlageAusBefehl implements Befehl{
    StereoAnlage anlage;

    public StereoAnlageAusBefehl(StereoAnlage anlage) {
        this.anlage = anlage;
    }

    @Override
    public void ausfuehren() {
        this.anlage.aus();
    }

    @Override
    public void rueckgaengig() {
        this.anlage.ein();
        this.anlage.setCD();
        this.anlage.setLautstaerke(13);
    }
}
