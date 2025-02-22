package com.example.observer;

import com.example.observer.custom.WetterAppCustom;
import com.example.observer.propertyChangeListener.WetterAppPcl;

public class WetterAppUser {

    public static void main(String[] args) {
        WetterAppCustom appCustom = new WetterAppCustom();
        WetterAppPcl appPcl = new WetterAppPcl();

        appCustom.run();
        appPcl.run();
    }
}
