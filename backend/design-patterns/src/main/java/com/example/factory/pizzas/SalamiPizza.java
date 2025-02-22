package com.example.factory.pizzas;

import com.example.factory.zutaten.PizzaZutatenFabrik;

public class SalamiPizza extends Pizza {

    private final PizzaZutatenFabrik zutatenFabrik;

    public SalamiPizza(PizzaZutatenFabrik zutatenFabrik) {
        this.zutatenFabrik = zutatenFabrik;
    }

    @Override
    public void vorbereiten() {
        System.out.println("Mache " + this.name);
        this.teig = zutatenFabrik.erstelleTeig();
        this.sosse = zutatenFabrik.erstelleSosse();
        this.salami = zutatenFabrik.erstelleSalami();
        this.kaese = zutatenFabrik.erstelleKaese();
    }
}
