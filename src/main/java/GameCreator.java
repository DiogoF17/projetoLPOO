import java.util.Random;

public class GameCreator {
    private final Random random;

    public GameCreator() {
        this.random = new Random();
    }

    public Game createGame(int width, int height, int enemies, int coins, int walls) {
        Hero hero = new Hero(new Position(width / 2, height / 2));
        Arena arena = new Arena(width, height, hero);
        Game game = new Game(arena);

        /*for (int i = 0; i < coins; i++)
            arena.addElement(new Coin(random.nextInt(width), random.nextInt(height), random.nextInt(10) + 1));

        for (int i = 0; i < enemies; i++)
            arena.addElement(new Enemy(random.nextInt(width), random.nextInt(height), 2, new ZombieMoveStrategy()));

        for (int i = 0; i < walls; i++)
            arena.addElement(new Wall(random.nextInt(width), random.nextInt(height)));*/

        return game;
    }
}
