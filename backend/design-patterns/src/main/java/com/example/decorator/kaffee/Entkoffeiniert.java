package com.example.decorator.kaffee;

import com.example.decorator.Getraenk;

public class Entkoffeiniert extends Getraenk {

    public Entkoffeiniert() {
        setBeschreibung("Entkoffeiniert");
    }

    @Override
    public double preis() {
        return 1.05;
    }
}
