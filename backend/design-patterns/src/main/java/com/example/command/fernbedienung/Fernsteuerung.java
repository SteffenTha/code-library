package com.example.command.fernbedienung;

import com.example.command.Befehle.Befehl;
import com.example.command.Befehle.KeinBefehl;

public class Fernsteuerung {

    private Befehl[] anBefehle = new Befehl[7];
    private Befehl[] ausBefehle = new Befehl[7];
    public Fernsteuerung() {
        for (int i = 0; i < anBefehle.length; i++) {
            anBefehle[i] = new KeinBefehl();
            ausBefehle[i] = new KeinBefehl();
        }
    }

    public void setBefehl(int position, Befehl anBefehl, Befehl ausBefehl) {
        anBefehle[position] = anBefehl;
        ausBefehle[position] = ausBefehl;
    }

    public void anKnopfGedrueckt(int position) {
        this.knopfGedrueckt(anBefehle, position);
    }

    public void ausKnopfGedrueckt(int position) {
        this.knopfGedrueckt(ausBefehle, position);
    }

    private void knopfGedrueckt(Befehl[] befehle, int position) {
        befehle[position].ausfuehren();
    }

    public String tastenbelegungAnzeigen() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n::::: TastenBelegung  :::::\n");
        for (int i = 0; i < anBefehle.length; i++) {
            String tasteAn = getTastenBelegung(anBefehle, i, "An");
            String tasteAus = getTastenBelegung(ausBefehle, i, "Aus");
            sb.append("\n[Platz " + i + "] " + tasteAn + "    " + tasteAus);
        }
        return sb.toString();
    }

    private String getTastenBelegung(Befehl[] befehle, int position, String aktion) {
        // String befehl = "Kein Befehl";
        //if (befehle[position] != null) {
            String befehl = befehle[position].getClass().getSimpleName();
        //}

        return aktion + "-Befehl = " + befehl + " ";
    }
}
