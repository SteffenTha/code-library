package com.example.adapter;

public class EnteTestlauf {
    public static void main(String[] args) {
        Ente stockente = new Stockente();
        Truthahn truthahn = new WilderTruthahn();
        Ente truthahnAdaper = new TruthahnAdapter(truthahn);

        System.out.println("===== TRUTHAHN =====");
        truthahn.fliegen();
        truthahn.kollern();
        System.out.println("\n===== Ente =====");
        testeEnte(stockente);
        System.out.println("\n===== TRUTHAHN-Adapter =====");
        testeEnte(truthahnAdaper);
    }

    static void testeEnte(Ente ente) {
        ente.quacken();
        ente.fliegen();
    }
}
