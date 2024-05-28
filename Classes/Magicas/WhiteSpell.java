package Magicas;

import Entidades.Player;

public class WhiteSpell extends Spell {
    int id;
    String name;
    String type;
    int mana_needed;
    int base_cure;

    public WhiteSpell(int id, String name, String type, int mana_needed, int base_cure) {
        super(id, name, type, mana_needed);
        this.base_cure = base_cure;
    }
}
