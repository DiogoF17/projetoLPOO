import java.io.IOException;

public class Application implements GameObserver {

    private Game game;
    private Gui gui;

    public static void main(String[] args) throws IOException {
        new Application().start();
    }

    private void start() throws IOException {
        GameCreator gameCreator = new GameCreator();
        this.game = gameCreator.createGame(100, 70, 10, 20, 40);
        this.game.addObserver(this);
        this.gui = new Gui(this.game);

        gui.draw();

        while(!game.getFinish())
            gui.getNextCommand();

        gui.endGame();
    }

    @Override
    public void gameChanged() {
        try {
            gui.draw();
        } catch (IOException e) {
            // Nothing to do if drawing fails
        }
    }
}
