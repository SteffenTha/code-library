package com.example.command.Befehle;


import com.example.command.haushaltsgeraete.GaragenTor;

public class GaragentorOeffnenBefehl implements Befehl {

    GaragenTor tor;
    public GaragentorOeffnenBefehl(GaragenTor tor) {
        this.tor = tor;
    }

    @Override
    public void ausfuehren() {
        this.tor.hoch();
    }

    @Override
    public void rueckgaengig() {
        this.tor.runter();
    }
}
