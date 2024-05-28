package Entidades;

import java.util.List;

public abstract class Enemy extends Entity {

    protected int id;
    List<String> strong_against;
    List<String> weak_against;

    public Enemy(int id, String image, String name, int HP, int maxHP, int attack, int magic, int defense, int speed, List<String> strong_against, List<String> weak_against) {
        super(image, name, HP, maxHP, attack, magic, defense, speed);
        this.id = id;
        this.strong_against = strong_against;
        this.weak_against = strong_against;
    }

    public void getEnemyStats() {
        System.out.println(" ");
        System.out.println(this.name);
        System.out.println("HP: " + this.HP);
    }
}
