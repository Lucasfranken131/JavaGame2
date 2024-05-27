package Entidades;

import java.util.ArrayList;
import java.util.List;
import Magicas.Magic;

public class Player extends Entity {

    private int mana;
    private int maxMana;
    private int level;
    private List<Magic> magics;

    public Player(String image, String name, int HP, int maxHP, int attack, int defense, int mana, int maxMana, int speed, int level) {
        super(image, name, HP, maxHP, attack, defense, speed);
        this.mana = mana;
        this.maxMana = maxMana;
        this.level = level;
        this.magics = new ArrayList<>();
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

    public void addMagic(Magic magic) {
        magics.add(magic);
    }

    public void correctValues() {
        correctMaxHP();
        correctMaxMana();
    }
}
