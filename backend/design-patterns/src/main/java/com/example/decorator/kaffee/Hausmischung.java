package com.example.decorator.kaffee;

import com.example.decorator.Getraenk;

public class Hausmischung extends Getraenk {

    public Hausmischung() {
        setBeschreibung("Hausmischung");
    }


    @Override
    public double preis() {
        return 0.89;
    }
}
