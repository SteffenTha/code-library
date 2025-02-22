package com.example.factory.zutaten;

public interface PizzaZutatenFabrik {

    Teig erstelleTeig();
    Sosse erstelleSosse();
    Kaese erstelleKaese();
    Salami erstelleSalami();
    Gemuese[] erstelleGemuese();
    Thunfisch erstelleThunfisch();
    Krabben erstelleKrabben();
    Schinken erstelleSchinken();
}
