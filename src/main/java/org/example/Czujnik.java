package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Czujnik implements Component {
    private boolean wlaczony;
    private String idCzujnika;
    private static Random generatorAlarmu = new Random();

    public Czujnik(String id) {
        wlaczony = false;
        idCzujnika = id;
    }

    @Override
    public void wlacz() {
        wlaczony = true;
        System.out.println("Czujnik zostal wlaczony");
    }

    @Override
    public void wylacz() {
        wlaczony = false;
        System.out.println("Czujnik zostal wylaczony");
    }

    @Override
    public boolean jestWlaczony() {
        return wlaczony;
    }

    @Override
    public boolean jestAlarm() {
        return generatorAlarmu.nextBoolean();
    }

    @Override
    public String podajId() {
        return idCzujnika;
    }
}
