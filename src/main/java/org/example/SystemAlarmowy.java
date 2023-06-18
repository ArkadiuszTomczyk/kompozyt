package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class SystemAlarmowy implements Component {
    private List<Component> czujniki = new ArrayList<>();

    public void dodaj(Component c) {
        czujniki.add(c);
    }

    public void pokazElementy() {
        System.out.println("Elementy systemu:");
        for(Component c : czujniki)
            System.out.println(c.podajId());
    }

    @Override
    public void wlacz() {
        for(Component c : czujniki)
            c.wlacz();
    }

    @Override
    public void wylacz() {
        for(Component c : czujniki)
            c.wylacz();
    }

    @Override
    public boolean jestWlaczony() {
        for(Component c : czujniki)
            if(c.jestWlaczony())
                return true;
        return false;
    }

    @Override
    public boolean jestAlarm() {
        for(Component c : czujniki)
            if(c.jestWlaczony() && c.jestAlarm())
                return true;
        return false;
    }

    @Override
    public String podajId() {
        return "SystemAlarmowy";
    }
}

