package Inimigos;

import java.util.List;

import Entidades.Enemy;

public class Goblin extends Enemy {

    static int id = 2;
    static String image = "goblin.png";
    static String name = "Goblin";

    public Goblin(int HP, int maxHP, int attack, int magic, int defense, int speed, List<String> strong_against, List<String> weak_against) {
        super(id, image,name, HP, maxHP, attack, magic, defense, speed, strong_against, weak_against);
    }
}
