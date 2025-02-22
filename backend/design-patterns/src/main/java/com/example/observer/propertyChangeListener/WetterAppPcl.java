package com.example.observer.propertyChangeListener;

import com.example.observer.propertyChangeListener.anzeigen.AktuelleBedingungen;
import com.example.observer.propertyChangeListener.anzeigen.Statistik;
import com.example.observer.propertyChangeListener.anzeigen.Vorhersage;
import com.example.observer.propertyChangeListener.anzeigen.Waermeindex;

public class WetterAppPcl {
    WetterDatenSenderPcl sender = new WetterDatenSenderPcl();
    AktuelleBedingungen aktuelleBedingungenAnzeige = new AktuelleBedingungen(sender);
    Statistik statistikAnzeige = new Statistik(sender);
    Vorhersage vorhersageAnzeige = new Vorhersage(sender);
    Waermeindex waermeindexAnzeige = new Waermeindex(sender);

    public void run() {
        sender.messwerteGeaendert();
    }
}
