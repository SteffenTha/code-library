package com.example.factory.zutaten;

import com.example.factory.zutaten.impl.*;

public class MuenchnerPizzaZutatenFabrik implements PizzaZutatenFabrik {
    @Override
    public Teig erstelleTeig() {
        return new TeigMitFesterKruste();
    }

    @Override
    public Sosse erstelleSosse() {
        return new TomatenSosse();
    }

    @Override
    public Kaese erstelleKaese() {
        return new Mozzarella();
    }

    @Override
    public Salami erstelleSalami() {
        return new ItalienischeSalami();
    }

    @Override
    public Gemuese[] erstelleGemuese() {
        return new Gemuese[]{new SchwarzeOliven(), new Spinat(), new Aubergine()};
    }

    @Override
    public Thunfisch erstelleThunfisch() {
        return new ThunfischStuecke();
    }

    @Override
    public Krabben erstelleKrabben() {
        return new GefroreneKrabben();
    }

    @Override
    public Schinken erstelleSchinken() {
        return new Kochschinken();
    }
}
