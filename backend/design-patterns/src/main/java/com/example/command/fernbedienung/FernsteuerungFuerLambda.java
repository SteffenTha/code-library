package com.example.command.fernbedienung;

import com.example.command.Befehle.EinfacherBefehl;

public class FernsteuerungFuerLambda {

    private EinfacherBefehl[] anBefehle = new EinfacherBefehl[7];
    private EinfacherBefehl[] ausBefehle = new EinfacherBefehl[7];
    public FernsteuerungFuerLambda() {
        for (int i = 0; i < anBefehle.length; i++) {
            anBefehle[i] = () -> {};
            ausBefehle[i] = () -> {};
        }
    }

    public void setBefehl(int position, EinfacherBefehl anBefehl, EinfacherBefehl ausBefehl) {
        anBefehle[position] = anBefehl;
        ausBefehle[position] = ausBefehl;
    }

    public void anKnopfGedrueckt(int position) {
        this.knopfGedrueckt(anBefehle, position);
    }

    public void ausKnopfGedrueckt(int position) {
        this.knopfGedrueckt(ausBefehle, position);
    }

    private void knopfGedrueckt(EinfacherBefehl[] befehle, int position) {
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

    private String getTastenBelegung(EinfacherBefehl[] befehle, int position, String aktion) {
        // String befehl = "Kein Befehl";
        //if (befehle[position] != null) {
            String befehl = befehle[position].getClass().getSimpleName();
        //}

        return aktion + "-Befehl = " + befehl + " ";
    }
}
