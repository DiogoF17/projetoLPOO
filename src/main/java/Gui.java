import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Gui {

    private final Game game;
    private final TerminalScreen screen;

    public Gui(Game game) throws IOException {
        TerminalSize terminalSize = new TerminalSize(game.getArena().getWidth(), game.getArena().getHeight() + 1);
        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory()
                .setInitialTerminalSize(terminalSize);

        Terminal terminal = terminalFactory.createTerminal();
        screen = new TerminalScreen(terminal);

        screen.setCursorPosition(null);   // we don't need a cursor
        screen.startScreen();             // screens must be started
        screen.doResizeIfNecessary();     // resize screen if necessary

        this.game = game;
    }

    public void draw() throws IOException {
        screen.clear();

        State state = game.getState();

        if(state instanceof Arena)
            drawArena(state);
        else if(state instanceof MainMenu)
            drawMainMenu(state);
        else
            drawPauseMenu(state);

        screen.refresh();
    }

    private void drawArena(State state){}

    private void drawMainMenu(State state){
        MainMenu mainMenu = (MainMenu) state;

        if (mainMenu.getHighlighted() == 1)
            drawMainMenuHighlighted1(mainMenu);
        else
            drawMainMenuHighlighted2(mainMenu);

        drawGroup();
    }

    private void drawMainMenuHighlighted1(MainMenu mainMenu){
        TextGraphics graphics = screen.newTextGraphics();
        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(mainMenu.getPosition().getX(), mainMenu.getPosition().getY(), "MAIN MENU");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(mainMenu.getPosition().getX() + 2, mainMenu.getPosition().getY() + 2, "Play");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(mainMenu.getPosition().getX() + 2, mainMenu.getPosition().getY() + 3, "Exit");
    }

    private void drawMainMenuHighlighted2(MainMenu mainMenu){
        TextGraphics graphics = screen.newTextGraphics();
        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(mainMenu.getPosition().getX(), mainMenu.getPosition().getY(), "MAIN MENU");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(mainMenu.getPosition().getX() + 2, mainMenu.getPosition().getY() + 2, "Play");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(mainMenu.getPosition().getX() + 2, mainMenu.getPosition().getY() + 3, "Exit");
    }

    private void drawPauseMenu(State state){
        PauseMenu pauseMenu = (PauseMenu) state;

        if (pauseMenu.getHighlighted() == 1)
            drawPauseMenuHighlighted1(pauseMenu);
        else if (pauseMenu.getHighlighted() == 2)
            drawPauseMenuHighlighted2(pauseMenu);
        else if (pauseMenu.getHighlighted() == 3)
            drawPauseMenuHighlighted3(pauseMenu);
        else
            drawPauseMenuHighlighted4(pauseMenu);

        drawGroup();
    }

    private void drawPauseMenuHighlighted1(PauseMenu pauseMenu) {
        TextGraphics graphics = screen.newTextGraphics();
        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX(), pauseMenu.getPosition().getY(), "PAUSE MENU");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 2, "Resume");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 3, "Restart");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 4, "MainMenu");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 5, "Exit");
    }

    private void drawPauseMenuHighlighted2(PauseMenu pauseMenu) {
        TextGraphics graphics = screen.newTextGraphics();
        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX(), pauseMenu.getPosition().getY(), "PAUSE MENU");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 2, "Resume");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 3, "Restart");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 4, "MainMenu");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 5, "Exit");

    }

    private void drawPauseMenuHighlighted3(PauseMenu pauseMenu) {
        TextGraphics graphics = screen.newTextGraphics();
        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX(), pauseMenu.getPosition().getY(), "PAUSE MENU");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 2, "Resume");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 3, "Restart");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 4, "MainMenu");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 5, "Exit");

    }

    private void drawPauseMenuHighlighted4(PauseMenu pauseMenu) {
        TextGraphics graphics = screen.newTextGraphics();
        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX(), pauseMenu.getPosition().getY(), "PAUSE MENU");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 2, "Resume");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 3, "Restart");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 4, "MainMenu");

        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(pauseMenu.getPosition().getX() + 2, pauseMenu.getPosition().getY() + 5, "Exit");

    }

    private void drawGroup(){
        TextGraphics graphics = screen.newTextGraphics();
        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.putString(0, 0, "GROUP:");
        graphics.putString(0, 1, "Diogo Santos / up201806878");
        graphics.putString(0, 2, "Marcelo Reis / up201809566");
    }

    public void endGame(){
        try {
            screen.close();
        }
        catch(IOException e){
            //Nao faz nada
        }
    }

    public void getNextCommand() throws IOException {
        KeyStroke input = screen.readInput();

        if (input.getKeyType() == KeyType.EOF) game.exit();
        if (input.getKeyType() == KeyType.Escape) game.esc();
        if (input.getKeyType() == KeyType.Enter) game.enter();
        if (input.getKeyType() == KeyType.ArrowDown) game.arrowDown();
        if (input.getKeyType() == KeyType.ArrowUp) game.arrowUp();
        if (input.getKeyType() == KeyType.ArrowLeft) game.arrowLeft();
        if (input.getKeyType() == KeyType.ArrowRight) game.arrowRight();

    }

}
