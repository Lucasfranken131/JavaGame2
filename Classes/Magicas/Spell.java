package Magicas;

import Entidades.Entity;

public class Spell {
    int id;
    String name;
    String type;
    int mana_needed;

    public Spell(int id, String name, String type, int mana_needed) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.mana_needed = mana_needed;
    }

    public String getName() {
        return this.name;
    }

    public int getManaNeeded() {
        return this.mana_needed;
    }

    public int cast(Spell spell, Entity caster, Entity target) {
        int value = 10000;
        return value;
    }
}
