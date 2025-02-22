package com.example.factory.pizzarias;

import com.example.factory.pizzas.*;
import com.example.factory.zutaten.MuenchnerPizzaZutatenFabrik;
import com.example.factory.zutaten.PizzaZutatenFabrik;

public class MuenchenPizzaria extends Pizzaria {
    @Override
    public Pizza erstellePizza(String typ) {
        Pizza pizza = null;
        PizzaZutatenFabrik zutatenFabrik = new MuenchnerPizzaZutatenFabrik();
        if("Salami".equals(typ)) {
            pizza = new SalamiPizza(zutatenFabrik);
            pizza.name = "Salamipizza Münchner Art";
        } else if ("Thunfisch".equals(typ)) {
            pizza = new ThunfischPizza(zutatenFabrik);
            pizza.name = "Thunfischpizza Münchner Art";
        } else if ("Schinken".equals(typ)) {
            pizza = new SchinkenPizza(zutatenFabrik);
            pizza.name = "Schinkenpizza Münchner Art";
        } else if ("Krabben".equals(typ)) {
            pizza = new KrabbenPizza(zutatenFabrik);
            pizza.name = "Krabbenpizza Münchner Art";
        }
        return pizza;
    }
}
