public abstract class Entity {
    public String name;
    public double hp;
    public int attack;
    public int defense;
    public int speed;

    public Entity(String name, double hp, int attack, int defense, int speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public void shout() {
        String shout = "Meu nome é " + this.name;
        System.out.println(shout);
    }

    public void setHP(double hp) {
        this.hp = hp;
    }
}
