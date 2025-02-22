package com.example.factory.zutaten;

import com.example.factory.zutaten.impl.*;

public class BerlinerPizzaZutatenFabrik implements PizzaZutatenFabrik {
    @Override
    public Teig erstelleTeig() {
        return new TeigMitDuennerKruste();
    }

    @Override
    public Sosse erstelleSosse() {
        return new MarinaraSosse();
    }

    @Override
    public Kaese erstelleKaese() {
        return new Parmesan();
    }

    @Override
    public Salami erstelleSalami() {
        return new SpanischeSalami();
    }

    @Override
    public Gemuese[] erstelleGemuese() {
        return new Gemuese[]{new Knoblauch(), new Zwiebeln(), new Pilze(), new Paprika()};
    }

    @Override
    public Thunfisch erstelleThunfisch() {
        return new ThunfischStuecke();
    }

    @Override
    public Krabben erstelleKrabben() {
        return new FrischeKrabben();
    }

    @Override
    public Schinken erstelleSchinken() {
        return new Kochschinken();
    }
}
