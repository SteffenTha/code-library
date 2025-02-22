package com.example.factory.pizzas;

import com.example.factory.zutaten.*;

import java.util.Arrays;

public abstract class Pizza {
    public String name;
    public Teig teig;
    public Sosse sosse;
    public Salami salami;
    public Gemuese[] gemuese;
    public Kaese kaese;
    public Thunfisch thunfisch;
    public Krabben krabben;
    public Schinken schinken;

    public abstract void vorbereiten();
    public void backen() {
        System.out.println("Backe Pizza bei 350° für 25 Minuten");
    }
    public void schneiden() {
        System.out.println("Schneide Pizza diagonale in Stücke");
    }
    public void einpacken() {
        System.out.println("Verpacke Pizza in den offiziellen Pizzakarton");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", teig=" + teig +
                ", sosse=" + sosse +
                ", salami=" + salami +
                ", gemuese=" + Arrays.toString(gemuese) +
                ", kaese=" + kaese +
                ", thunfisch=" + thunfisch +
                ", krabben=" + krabben +
                '}';
    }
}
