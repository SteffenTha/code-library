package com.example.factory.pizzarias;

import com.example.factory.pizzas.*;

public abstract class Pizzaria {

    public Pizza bestellePizza(String typ) {
        Pizza pizza = erstellePizza(typ);
        pizza.vorbereiten();
        pizza.backen();
        pizza.schneiden();
        pizza.einpacken();
        return pizza;
    }

    public abstract Pizza erstellePizza(String typ);
}
