package Inimigos;
import java.util.List;

import Entidades.Enemy;

public class Orc extends Enemy {

    static int id = 3;
    static String image = "orc.png";
    static String name = "Orc";

    public Orc(int HP, int maxHP, int attack, int magic, int defense, int speed, List<String> strong_against, List<String> weak_against) {
        super(id, image,name, HP, maxHP, attack, magic, defense, speed, strong_against, weak_against);
    }
}
