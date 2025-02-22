package com.example.observer.custom;


import com.example.observer.custom.anzeigen.AktuelleBedingungen;
import com.example.observer.custom.anzeigen.Statistik;
import com.example.observer.custom.anzeigen.Vorhersage;
import com.example.observer.custom.anzeigen.Waermeindex;

public class WetterAppCustom {
    WetterDaten wetterDaten = new WetterDaten();
    AktuelleBedingungen aktuelleAnzeige = new AktuelleBedingungen(wetterDaten);
    Statistik statistikAnzeige = new Statistik(wetterDaten);
    Vorhersage vorhersageAnzeige = new Vorhersage(wetterDaten);
    Waermeindex waermeindexAnzeige = new Waermeindex(wetterDaten);

    public void run() {
        wetterDaten.messwerteGeaendert();
    }

}
