package com.example.decorator.kaffee;

import com.example.decorator.Getraenk;

public class DunkelGeroestet extends Getraenk {


    public DunkelGeroestet() {
        setBeschreibung("Dunkle Röstung");
    }

    @Override
    public double preis() {
        return 0.99;
    }
}
