package Inimigos;

import java.util.List;

import Entidades.Enemy;

public class Kobold extends Enemy {

    static int id = 4;
    static String image = "kobold.png";
    static String name = "Kobold";

    public Kobold(int HP, int maxHP, int attack, int magic, int defense, int speed, List<String> strong_against, List<String> weak_against) {
        super(id, image,name, HP, maxHP, attack, magic, defense, speed, strong_against, weak_against);
    }
}
