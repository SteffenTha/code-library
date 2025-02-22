package com.example.command;

import com.example.command.Befehle.*;
import com.example.command.Befehle.ventilator.VentilatorAusBefehl;
import com.example.command.Befehle.ventilator.VentilatorLangsamBefehl;
import com.example.command.Befehle.ventilator.VentilatorMittelBefehl;
import com.example.command.Befehle.ventilator.VentilatorSchnellBefehl;
import com.example.command.fernbedienung.FernsteuerungFuerLambda;
import com.example.command.haushaltsgeraete.GaragenTor;
import com.example.command.haushaltsgeraete.Licht;
import com.example.command.haushaltsgeraete.StereoAnlage;
import com.example.command.haushaltsgeraete.Ventilator;

public class FernsteuerungLaden {
    public static void main(String[] args) {
        // region Setup
        // Befehle
        Licht licht = new Licht();
        Befehl lichtAnBefehl = new LichtAnBefehl(licht);
        Befehl lichtAusBefehl = new LichtAusBefehl(licht);

        GaragenTor garagenTor = new GaragenTor();
        Befehl garagenTorBefehl = new GaragentorOeffnenBefehl(garagenTor);

        StereoAnlage stereoAnlage = new StereoAnlage();
        Befehl stereoAnlageAnMitCDBefehl = new StereoAnlageAnMitCDBefehl(stereoAnlage);
        Befehl stereoAuslageAnMitCDBefehl = new StereoAnlageAusBefehl(stereoAnlage);

        Ventilator ventilator = new Ventilator("Wohnzimmer");
        Befehl ventilatorSchnellBefehl = new VentilatorSchnellBefehl(ventilator);
        Befehl ventilatorMittelBefehl = new VentilatorMittelBefehl(ventilator);
        Befehl ventilatorLangsamBefehl = new VentilatorLangsamBefehl(ventilator);
        Befehl ventilatorAusBefehl = new VentilatorAusBefehl(ventilator);
        // endregion

        //region Einfache Fernsteuerung
        // EinfacheFernsteuerung fernsteuerung = new EinfacheFernsteuerung();
        // Licht an
        // fernsteuerung.setPlatz(lichtAnBefehl);
        // fernsteuerung.knopfGedrueckt();

        // Garagentor hoch
        // fernsteuerung.setPlatz(garagenTorBefehl);
        // fernsteuerung.knopfGedrueckt();
        //endregion

        //region Fernsteuerung
        // Fernsteuerung fernsteuerung = new Fernsteuerung();
        // fernsteuerung.setBefehl(0, lichtAnBefehl, lichtAusBefehl);
        // fernsteuerung.setBefehl(1, stereoAnlageAnMitCDBefehl, stereoAuslageAnMitCDBefehl);

        // fernsteuerung.anKnopfGedrueckt(0);
        // fernsteuerung.anKnopfGedrueckt(1);
        // fernsteuerung.ausKnopfGedrueckt(0);
        // fernsteuerung.ausKnopfGedrueckt(1);

        // System.out.println(fernsteuerung.tastenbelegungAnzeigen());

        //endregion

        // region Fernbedienung mit rückgängig
//        FernsteuerungMitRueck fernsteuerungMitRueck = new FernsteuerungMitRueck();
        // Befehle Licht & Stereo
        // fernsteuerungMitRueck.setBefehl(0, lichtAnBefehl, lichtAusBefehl);
        // fernsteuerungMitRueck.setBefehl(1, stereoAnlageAnMitCDBefehl, stereoAuslageAnMitCDBefehl);
        // fernsteuerungMitRueck.anKnopfGedrueckt(0);
        // fernsteuerungMitRueck.ausKnopfGedrueckt(0);
        // fernsteuerungMitRueck.rueckgaengigGedrueckt();

        // Befehle Ventilator
//        fernsteuerungMitRueck.setBefehl(0, ventilatorMittelBefehl, ventilatorAusBefehl);
//        fernsteuerungMitRueck.setBefehl(1, ventilatorSchnellBefehl, ventilatorAusBefehl);
//
//        fernsteuerungMitRueck.anKnopfGedrueckt(0);
//        fernsteuerungMitRueck.ausKnopfGedrueckt(0);
//        System.out.println(fernsteuerungMitRueck.tastenbelegungAnzeigen());
//        fernsteuerungMitRueck.rueckgaengigGedrueckt();
//
//        fernsteuerungMitRueck.anKnopfGedrueckt(1);
//        System.out.println(fernsteuerungMitRueck.tastenbelegungAnzeigen());
//        fernsteuerungMitRueck.rueckgaengigGedrueckt();
        //endregion

        // region Lambda und Methodenreferenz
        FernsteuerungFuerLambda fernsteuerung = new FernsteuerungFuerLambda();
        Licht wohnzimmerBeleuchtung = new Licht();
        fernsteuerung.setBefehl(0, wohnzimmerBeleuchtung::ein, wohnzimmerBeleuchtung::aus);
        fernsteuerung.anKnopfGedrueckt(0);
        fernsteuerung.ausKnopfGedrueckt(0);
        EinfacherBefehl stereoAnBefehl = () -> {stereoAnlage.ein(); stereoAnlage.setCD(); stereoAnlage.setLautstaerke(11);};
        fernsteuerung.setBefehl(1, stereoAnBefehl, stereoAnlage::aus);
        fernsteuerung.anKnopfGedrueckt(1);
        System.out.println(fernsteuerung.tastenbelegungAnzeigen());
        //endregion

    }

}
