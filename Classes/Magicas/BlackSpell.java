package Magicas;

import java.util.List;

import Entidades.Entity;

public class BlackSpell extends Spell {
    int id;
    String name;
    String type;
    int mana_needed;
    int base_damage;
    List<String> strong_against;
    List<String> weak_against;

    public BlackSpell(int id, String name, String type, int mana_needed, int base_damage, List<String> strong_against, List<String> weak_against) {
        super(id, name, type, mana_needed);
        this.base_damage = base_damage;
        this.strong_against = strong_against;
        this.weak_against = weak_against;
    }

    public int cast(Spell spell, Entity caster, Entity target) {
        int damage = 0;
        if(caster.getMagic() >= target.getDefense()) {
            damage = caster.getMagic() * 2 - target.getDefense();
        }
        else {
            damage = caster.getMagic() * caster.getMagic() / target.getDefense();
        }
        System.out.println("Dano em cast: "+ damage);
        return damage;
    }
}
