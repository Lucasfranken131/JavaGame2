public class Battle {
    public Enemy enemy;
    public Player player;

    public Battle(Enemy enemy, Player player) {
        this.enemy = enemy;
        this.player = player;       
    }
        
    public void Turno() {
        System.out.println(enemy.name + " HP: "+ enemy.hp);
        System.out.println();
        System.out.println(player.name + " HP: "+ player.hp);
        System.out.println();
        
        enemy.Dano(player);
        player.Dano(enemy);
    }
}
