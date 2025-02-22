package com.example.decorator;

import com.example.decorator.kaffee.DunkelGeroestet;
import com.example.decorator.kaffee.Espresso;
import com.example.decorator.kaffee.Hausmischung;
import com.example.decorator.zutaten.Milchschaum;
import com.example.decorator.zutaten.Schoko;
import com.example.decorator.zutaten.Soja;

public class SternbackKaffee {

    public static void main(String[] args) {
        Getraenk getraenk1 = new Espresso();

        Getraenk getraenk2 = new DunkelGeroestet();
        getraenk2 = new Schoko(getraenk2);
        getraenk2 = new Schoko(getraenk2);
        getraenk2 = new Milchschaum(getraenk2);

        Getraenk getraenk3 = new Hausmischung();
        getraenk3 = new Soja(getraenk3);
        getraenk3 = new Schoko(getraenk3);
        getraenk3 = new Milchschaum(getraenk3);

        druckeBestellung(getraenk1);
        druckeBestellung(getraenk2);
        druckeBestellung(getraenk3);
    }

    public static void druckeBestellung(Getraenk getraenk) {
        String beschreibung = getraenk.getBeschreibung();
        String preis = getraenk.preis() + " €";
        System.out.println(beschreibung + " " + preis);
    }
}
