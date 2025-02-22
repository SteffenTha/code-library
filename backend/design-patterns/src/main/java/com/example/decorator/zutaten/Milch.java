package com.example.decorator.zutaten;

import com.example.decorator.Getraenk;

public class Milch extends ZutatDekorierer {

    private Getraenk getraenk;

    public Milch(Getraenk getraenk) {
        this.getraenk = getraenk;
    }

    @Override
    public double preis() {
        return this.getraenk.preis() + 0.1;
    }

    @Override
    public String getBeschreibung() {
        return this.getraenk.getBeschreibung() + " + Milch";
    }
}
