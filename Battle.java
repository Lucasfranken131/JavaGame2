public class Battle {
    public Enemy enemy;
    public Player player;

    public Battle(Enemy enemy, Player player) {
        this.enemy = enemy;
        this.player = player;       
    }

    public void DanoE() {
        if(this.player.defense > this.enemy.attack) {
            double danoE = this.enemy.attack * 0.25;
            this.player.setHP(this.player.hp - danoE);
            System.out.println("Dano foi: " + danoE);
        }
        else {
            double danoE = this.enemy.attack * 0.5;
            this.player.setHP(this.player.hp - danoE);
            System.out.println("Dano foi: " + danoE);
        }
        System.out.println("Vida do player: "+ this.player.hp);
    }
    
    public void DanoP() {
        int danoP = this.player.attack - this.enemy.defense;
        this.enemy.setHP(this.enemy.hp - danoP);
        System.out.println("Dano foi: " + danoP);
        System.out.println("Vida do inimigo: "+ this.enemy.hp);
    }
        
    
    
}
