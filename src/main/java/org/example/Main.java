package org.example;

public class Main {
    public static void main(String[] args) {
        SystemAlarmowy systemGlowny = new SystemAlarmowy();

        SystemAlarmowy podsystem1 = new SystemAlarmowy();
        podsystem1.dodaj(new Czujnik("C01"));
        podsystem1.dodaj(new Czujnik("C02"));

        SystemAlarmowy podsystem2 = new SystemAlarmowy();
        podsystem2.dodaj(new Czujnik("C03"));

        systemGlowny.dodaj(podsystem1);
        systemGlowny.dodaj(podsystem2);

        systemGlowny.pokazElementy();
        systemGlowny.wlacz();

        if(systemGlowny.jestAlarm())
            System.out.println("Alarm!!!");
        else
            System.out.println("Brak alarmu");

        systemGlowny.wylacz();
    }
}