public abstract class Entity {
    public String name;
    public double hp;
    public int attack;
    public int defense;
    public int speed;
    public boolean canAct;

    public Entity(String name, double hp, int attack, int defense, int speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        canAct = true;
    }
    
    public void Dano(Entity enemy) {
        verifyAction();
        if(this.canAct == true) {
            if(enemy.defense > this.attack) {
                double danoE = this.attack * 0.25;
                enemy.setHP(enemy.hp - danoE);
                System.out.println("Dano foi: " + danoE);
            }
            else {
                double danoE = this.attack * 0.5;
                enemy.setHP(enemy.hp - danoE);
                System.out.println("Dano foi: " + danoE);
            }
        }
        System.out.println("Vida do "+ enemy.name+ ": " + enemy.hp);
    }

    public void shout() {
        String shout = "Meu nome é " + this.name;
        System.out.println(shout);
    }

    public void setHP(double hp) {
        this.hp = hp;
    }

    public void setCanAct(boolean canAct) {
        this.canAct = canAct;
    }

    public void verifyAction() {
        if(this.hp <= 0) {
            setCanAct(false);
            setHP(0);
        }
    }
} 