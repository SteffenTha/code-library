package com.example.decorator.zutaten;

import com.example.decorator.Getraenk;

public class Schoko extends ZutatDekorierer {

    private Getraenk getraenk;

    public Schoko(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    @Override
    public String getBeschreibung() {
        return this.getraenk.getBeschreibung() + " + Schoko";
    }

    @Override
    public double preis() {
        return getraenk.preis() + 0.2;
    }
}
