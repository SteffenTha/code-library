package com.example.observer.custom.anzeigen;


import com.example.observer.custom.Beobachter;
import com.example.observer.custom.Subjekt;

public class Waermeindex implements Beobachter, AnzeigeElement {

    private float temperatur;
    private float luftfeuchtigkeit;
    private Subjekt wetterdaten;

    public Waermeindex(Subjekt wetterdaten) {
        this.wetterdaten = wetterdaten;
        wetterdaten.registriereBeobachter(this);
    }

    @Override
    public void aktualisieren(float temp, float humid, float pressure) {
        this.temperatur = temp;
        this.luftfeuchtigkeit = humid;
        anzeigen();
    }

    @Override
    public void anzeigen() {
        float waermeindex = berechneWaermeIndex(this.temperatur, this.luftfeuchtigkeit);
        System.out.println(":::: Wäremindex ::::");
        System.out.println(waermeindex + "°C");
        System.out.println("\n");
    }

    private float berechneWaermeIndex(float temp, float humid) {
        temp = convertCelsiusToFahrenheit(temp);
        float index = (float)((16.923 + (0.185212 * temp) + (5.37941 * humid) - (0.100254 * temp * humid) +
                (0.00941695 * (temp * temp)) + (0.00728898 * (humid * humid)) +
                (0.000345372 * (temp * temp * humid)) - (0.000814971 * (temp * humid * humid)) +
                (0.0000102102 * (temp * temp * humid * humid)) - (0.000038646 * (temp * temp * temp)) + (0.0000291583 *
                (humid * humid * humid)) + (0.00000142721 * (temp * temp * temp * humid)) +
                (0.000000197483 * (temp * humid * humid * humid)) - (0.0000000218429 * (temp * temp * temp * humid * humid)) +
                0.000000000843296 * (temp * temp * humid * humid * humid)) -
                (0.0000000000481975 * (temp * temp * temp * humid * humid * humid)));
        return convertFahrenheitToCelsius(index);
    }

    private float convertCelsiusToFahrenheit(float temp) {
        temp = temp * 9;
        temp = temp / 5;
        temp = temp + 32;
        return temp;
    }

    private float convertFahrenheitToCelsius(float temp) {
        temp = temp - 32;
        temp = temp * 5;
        temp = temp / 9;
        return temp;
    }
}
