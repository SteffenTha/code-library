package com.example.factory.pizzas;

import com.example.factory.zutaten.PizzaZutatenFabrik;

public class ThunfischPizza extends Pizza {

    private final PizzaZutatenFabrik zutatenFabrik;

    public ThunfischPizza(PizzaZutatenFabrik zutatenFabrik) {
        this.zutatenFabrik = zutatenFabrik;
    }

    @Override
    public void vorbereiten() {
        System.out.println("Mache " + this.name);
        this.teig = zutatenFabrik.erstelleTeig();
        this.sosse = zutatenFabrik.erstelleSosse();
        this.kaese = zutatenFabrik.erstelleKaese();
        this.thunfisch = zutatenFabrik.erstelleThunfisch();
    }
}
