package com.example.command.haushaltsgeraete;

public class StereoAnlage {
    private int lautstaerke;

    public void ein() {
        System.out.println("::::: Stereoanalage ein :::::");
    }

    public void aus() {
        System.out.println("::::: Stereoanalage aus :::::");
    }
    public void setCD() {
        System.out.println("::::: CD spielt :::::");
    }
    public void setDVD() {
        System.out.println("::::: DVD einlegen :::::");
    }
    public void setRadio() {
        System.out.println("::::: Radiosender einstellen :::::");
    }
    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
        System.out.println("::::: Lautstaerke auf " + lautstaerke + " gestellt :::::");
    }
}
