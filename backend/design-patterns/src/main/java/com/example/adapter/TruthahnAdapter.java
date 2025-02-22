package com.example.adapter;

public class TruthahnAdapter implements Ente {

    Truthahn truthahn;

    public TruthahnAdapter(Truthahn truthahn) {
        this.truthahn = truthahn;
    }

    @Override
    public void quacken() {
        truthahn.kollern();
    }

    @Override
    public void fliegen() {
        for (int i = 0; i < 5; i++) {
            truthahn.fliegen();
        }
    }
}
