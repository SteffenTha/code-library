package com.example.factory.pizzas;

import com.example.factory.zutaten.PizzaZutatenFabrik;

public class SchinkenPizza extends Pizza {

    private final PizzaZutatenFabrik zutatenFabrik;

    public SchinkenPizza(PizzaZutatenFabrik zutatenFabrik) {
        this.zutatenFabrik = zutatenFabrik;
    }

    @Override
    public void vorbereiten() {
        System.out.println("Mache " + this.name);
        this.teig = zutatenFabrik.erstelleTeig();
        this.sosse = zutatenFabrik.erstelleSosse();
        this.kaese = zutatenFabrik.erstelleKaese();
        this.schinken = zutatenFabrik.erstelleSchinken();

    }
}
