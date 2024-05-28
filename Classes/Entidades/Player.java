package Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Magicas.BlackSpell;
import Magicas.Spell;

public class Player extends Entity {

    private int mana;
    private int maxMana;
    private int level;
    private List<Spell> spells;

    public Player(String image, String name, int HP, int maxHP, int attack, int magic,int defense, int mana, int maxMana, int speed, int level) {
        super(image, name, HP, maxHP, attack, magic, defense, speed);
        this.spells = new ArrayList<>();
        this.mana = mana;
        this.maxMana = maxMana;
        this.level = level;
        Spell fogo = new BlackSpell(1, "fireball", "fire", 10, 10, Arrays.asList("gelo"), Arrays.asList("fogo"));
        Spell gelo = new BlackSpell(2, "frost", "ice", 8, 8, Arrays.asList("fogo", "elétrico"), Arrays.asList("gelo"));
        addSpell(fogo);
        addSpell(gelo);
    }

    public void getPlayerStats() {
        System.out.println(" ");
        System.out.println(this.name);
        System.out.println("HP: " + this.HP);
        System.out.println("Mana: " + this.mana);
    }

    public int getLevel() {
        return this.level;
    }

    public int getMana() {
        return this.mana;
    }

    public int setMana(int mana){
        return this.mana = mana;
    }

    public void correctMaxMana() {
        if(this.mana > this.maxMana) {
            setMana(maxMana);
        }
        if(this.mana < 0) {
            this.mana = 0;
        }
    }

    public void correctValues() {
        correctMaxHP();
        correctMaxMana();
    }

    public int castSpell(String spell_name, Entity caster, Entity target) {
        int dano = 0;
        for(Spell spell : spells) {
            if(spell_name.equals(spell.getName())) {
                if(this.mana >= spell.getManaNeeded()) {
                    dano = spell.cast(spell, this, target);
                    return dano;
                }
                else {
                    System.out.println("Mana insuficiente para lançar " + spell_name);
                }
                break;
            }
            else {
                System.out.println("Magia não achada");
                dano = 0;
            }

        }
        System.out.println("Dano em castSpell: "+ dano);
        return dano;
    }
}
