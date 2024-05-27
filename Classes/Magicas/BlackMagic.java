package Magicas;

import Entidades.Entity;

public class BlackMagic extends Magic {
    int id;
    String type;
    int base_damage;
    String[] strong_against;
    String[] weak_against;

    public BlackMagic(int id, String type, int base_damage, String[] strong_against, String[] weak_against) {
        super(id, type);
        this.base_damage = base_damage;
        this.strong_against = strong_against;
        this.weak_against = weak_against;
    }
}
