package com.example.decorator.kaffee;

import com.example.decorator.Getraenk;

public class Espresso extends Getraenk {

    public Espresso() {
        setBeschreibung("Espresso");
    }

    @Override
    public double preis() {
        return 1.99;
    }
}
