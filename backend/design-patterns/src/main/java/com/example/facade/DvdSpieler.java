package com.example.facade;

public class DvdSpieler {

    String name;
    String film;

    public DvdSpieler(String name) {
        this.name = name;
    }

    void ein() {
        System.out.println("DVD-Spieler an");
    }
    void aus() {
        System.out.println("DVD-Spieler aus");
    }

    void spielen(String film) {
        this.film = film;
        System.out.println("DVD-Spieler spielt " + film);
    }

    void anhalten() {
        System.out.println("beende " + film);
    }

    void auswerfen() {
        System.out.println("DVD von " + film + " ausgeworfen");
        this.film = null;
    }
}
