package com.example.factory.pizzarias;

import com.example.factory.pizzas.*;
import com.example.factory.zutaten.BerlinerPizzaZutatenFabrik;
import com.example.factory.zutaten.PizzaZutatenFabrik;

public class BerlinPizzaria extends Pizzaria {
    @Override
    public Pizza erstellePizza(String typ) {
        Pizza pizza = null;
        PizzaZutatenFabrik zutatenFabrik = new BerlinerPizzaZutatenFabrik();
        if("Salami".equals(typ)) {
           pizza = new SalamiPizza(zutatenFabrik);
           pizza.name = "Salamipizza Berliner Art";
        } else if ("Thunfisch".equals(typ)) {
            pizza = new ThunfischPizza(zutatenFabrik);
            pizza.name = "Thunfischpizza Berliner Art";
        } else if ("Schinken".equals(typ)) {
            pizza = new SchinkenPizza(zutatenFabrik);
            pizza.name = "Schinkenpizza Berliner Art";
        } else if ("Krabben".equals(typ)) {
            pizza = new KrabbenPizza(zutatenFabrik);
            pizza.name = "Krabbenpizza Berliner Art";
        }
        return pizza;
    }
}
