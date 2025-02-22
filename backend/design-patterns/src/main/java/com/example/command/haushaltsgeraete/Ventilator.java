package com.example.command.haushaltsgeraete;

public class Ventilator {
    String ort;
    int geschwindigkeit;
    public static final int AUS = 0;
    public static final int LANGSAM = 1;
    public static final int MITTEL = 2;
    public static final int SCHNELL = 3;

    public Ventilator(String ort) {
        this.ort = ort;
        this.geschwindigkeit = AUS;
    }

    public void aus() {
        this.geschwindigkeit = AUS;
        System.out.println("::::: " + ort + ": Ventilator ist aus :::::");
    }

    public void langsam() {
        this.geschwindigkeit = LANGSAM;
        System.out.println("::::: " + ort + ": Ventilator ist langsam :::::");
    }

    public void mittel() {
        this.geschwindigkeit = MITTEL;
        System.out.println("::::: " + ort + ": Ventilator ist mittel :::::");
    }

    public void schnell() {
        this.geschwindigkeit = SCHNELL;
        System.out.println("::::: " + ort + ": Ventilator ist schnell :::::");
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }
}
