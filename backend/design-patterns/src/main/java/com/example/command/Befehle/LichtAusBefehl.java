package com.example.command.Befehle;


import com.example.command.haushaltsgeraete.Licht;

public class LichtAusBefehl implements Befehl{
    Licht licht;

    public LichtAusBefehl(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausfuehren() {
        this.licht.aus();
    }

    @Override
    public void rueckgaengig() {
        this.licht.ein();
    }
}
