package com.example.command.Befehle;


import com.example.command.haushaltsgeraete.Licht;

public class LichtAnBefehl implements Befehl{
    Licht licht;

    public LichtAnBefehl(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void ausfuehren() {
        this.licht.ein();
    }

    @Override
    public void rueckgaengig() {
        this.licht.aus();
    }
}
