package com.example.facade;

public class HeimkinoTestlauf {
    public static void main(String[] args) {
        Verstaerker verstarker = new Verstaerker();
        DvdSpieler dvdSpieler = new DvdSpieler("Super-DVD-Spieler");
        Beamer beamer = new Beamer();
        Beleuchtung beleuchtung = new Beleuchtung();
        Leinwand leinwand = new Leinwand();
        Popcornmaschine popcornmaschine = new Popcornmaschine();
        HeimKinoFassade heimKino = new HeimKinoFassade(verstarker, dvdSpieler, beamer, beleuchtung, leinwand, popcornmaschine);

        heimKino.filmSchauen("LOST IN TRANSLATION");
        heimKino.filmBeenden();
    }
}
