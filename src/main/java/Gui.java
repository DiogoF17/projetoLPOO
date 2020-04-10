import java.io.IOException;

public class Gui {

    private final Arena arena;
    private final TerminalScreen screen;

    public Gui(Arena arena) throws IOException {
        TerminalSize terminalSize = new TerminalSize(arena.getWidth(), arena.getHeight() + 1);
        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory()
                .setInitialTerminalSize(terminalSize);

        Terminal terminal = terminalFactory.createTerminal();
        screen = new TerminalScreen(terminal);

        screen.setCursorPosition(null);   // we don't need a cursor
        screen.startScreen();             // screens must be started
        screen.doResizeIfNecessary();     // resize screen if necessary

        this.arena = arena;
    }

}
