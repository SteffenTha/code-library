package com.example.decorator;

public abstract class Getraenk {
    private String beschreibung;
    public Getraenk() {
    }

    public abstract double preis();

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
}
