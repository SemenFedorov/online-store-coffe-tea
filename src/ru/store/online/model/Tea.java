package ru.store.online.model;

import ru.store.online.model.enumeration.TeaType;
import ru.store.online.model.enumeration.Aroma;

public class Tea extends Drink {

    private TeaType type;

    private Aroma aroma;

    public Aroma getAroma(Aroma aroma) {
        return aroma;
    }

    public void setAroma(Aroma aroma) {
        this.aroma = aroma;
    }

    public TeaType getTeaType() {
        return type;
    }

    public void setTeaType(TeaType type) {
        this.type = type;
    }
}
