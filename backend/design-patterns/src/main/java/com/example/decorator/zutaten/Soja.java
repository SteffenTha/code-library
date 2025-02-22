package com.example.decorator.zutaten;

import com.example.decorator.Getraenk;

public class Soja extends ZutatDekorierer {
    private Getraenk getraenk;

    public Soja(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    @Override
    public double preis() {
        return getraenk.preis() + 0.15;
    }

    @Override
    public String getBeschreibung() {
        return this.getraenk.getBeschreibung() + " + Soja";
    }
}
