package com.example.command.Befehle;


import com.example.command.haushaltsgeraete.StereoAnlage;

public class StereoAnlageAnMitCDBefehl implements Befehl{
    StereoAnlage anlage;

    public StereoAnlageAnMitCDBefehl(StereoAnlage anlage) {
        this.anlage = anlage;
    }

    @Override
    public void ausfuehren() {
        this.anlage.ein();
        this.anlage.setCD();
        this.anlage.setLautstaerke(13);
    }

    @Override
    public void rueckgaengig() {
        this.anlage.aus();
    }
}
