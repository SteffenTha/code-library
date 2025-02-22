package com.example.factory;

import com.example.factory.pizzarias.BerlinPizzaria;
import com.example.factory.pizzarias.MuenchenPizzaria;
import com.example.factory.pizzarias.Pizzaria;
import com.example.factory.pizzas.Pizza;

public class PizzaBestellung {
    public static void main(String[] args) {
        Pizzaria berlinPizzaria = new BerlinPizzaria();
        Pizzaria muenchenPizzaria = new MuenchenPizzaria();

        System.out.println("--- Pizza Berliner Art ---");
        Pizza berlinerPizza = berlinPizzaria.bestellePizza("Salami");
        System.out.println("Ben hat eine " + berlinerPizza.name + " bestellt\n");

        System.out.println("--- Pizza Münchner Art ---");
        Pizza muenchnerPizza = muenchenPizzaria.bestellePizza("Salami");
        System.out.println("Tassilo hat eine " + muenchnerPizza.name + " bestellt\n");
    }
}
