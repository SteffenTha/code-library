package com.example.facade;

public class HeimKinoFassade {
    Verstaerker verstaerker;
    DvdSpieler dvdSpieler;
    Beamer beamer;
    Beleuchtung beleuchtung;
    Leinwand leinwand;
    Popcornmaschine popcornmaschine;

    public HeimKinoFassade(Verstaerker verstaerker, DvdSpieler dvdSpieler, Beamer beamer, Beleuchtung beleuchtung, Leinwand leinwand, Popcornmaschine popcornmaschine) {
        this.verstaerker = verstaerker;
        this.dvdSpieler = dvdSpieler;
        this.beamer = beamer;
        this.beleuchtung = beleuchtung;
        this.leinwand = leinwand;
        this.popcornmaschine = popcornmaschine;
    }

    public void filmSchauen(String film) {
        System.out.println("===== Film im Heimkino geniessen =====");
        popcornmaschine.ein();
        popcornmaschine.starten();
        beleuchtung.dimmen(10);
        leinwand.runter();
        beamer.ein();
        beamer.breitwandModus();
        verstaerker.ein();
        verstaerker.setDvd(dvdSpieler);
        verstaerker.setSurroundSound();
        verstaerker.setLautstaerke(5);
        dvdSpieler.ein();
        dvdSpieler.spielen(film);
    }

    public void filmBeenden() {
        System.out.println("===== Film im Heimkino beenden =====");
        popcornmaschine.aus();
        beleuchtung.ein();
        leinwand.hoch();
        beamer.aus();
        verstaerker.aus();
        dvdSpieler.anhalten();
        dvdSpieler.auswerfen();
        dvdSpieler.aus();
    }
}
