package Magicas;

import Entidades.Player;

public class WhiteMagic extends Magic {
    int id;
    String type;
    int base_cure;

    public WhiteMagic(int id, String type, int base_cure) {
        super(id, type);
        this.base_cure = base_cure;
    }

    public static void cure(Player entity) {
        if(entity.getMana() >= 7 && entity.getHP() < entity.getMaxHP()) {
            entity.setHP(entity.getHP() + (int) (entity.getMana() * 0.35));
            entity.setMana((entity.getMana() - 7));
            entity.correctValues();
        }
    }
}
