package com.example.facade;

public class Verstaerker {

    void ein() {
        System.out.println("Verstärker an");
    }
    void aus() {
        System.out.println("Verstärker aus");
    }
    void setDvd(DvdSpieler dvdSpieler) {
        System.out.println("Setze DVD-Spieler auf " + dvdSpieler.name);
    }
    void setSurroundSound() {
        System.out.println("aktiviere Sorround-Sound");
    }
    void setLautstaerke(int lautstaerke) {
        System.out.println("setze Lautstärke auf " + lautstaerke);
    }
}
