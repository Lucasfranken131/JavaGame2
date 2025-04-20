public class Game {
    public static void main(String[] args) {
        Player jogador = new Player("Pelé", 10, 11, 11, 10);
        Enemy enemy = new Enemy("Jusom", 10, 20, 10, 10);
        Battle batalha = new Battle(enemy, jogador);
        batalha.DanoE();
        batalha.DanoP();
    }
}