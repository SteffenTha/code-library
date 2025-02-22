package com.example.observer.propertyChangeListener;

import java.beans.PropertyChangeListener;

public interface WetterDatenSender {
    void anzeigeHinzufuegen(PropertyChangeListener listener);
    void anzeigeEntfernen(PropertyChangeListener listener);
}
