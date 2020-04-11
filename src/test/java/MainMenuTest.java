import com.sun.tools.javac.Main;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class MainMenuTest {

    @Test
    public void arrowDownTest(){
        MainMenu mainMenu = new MainMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.arrowDown(gameMock);
        assertEquals(2, mainMenu.getHighlighted());

        mainMenu.arrowDown(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }

    @Test
    public void arrowUpTest(){
        MainMenu mainMenu = new MainMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.arrowUp(gameMock);
        assertEquals(2, mainMenu.getHighlighted());

        mainMenu.arrowUp(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }

    @Test
    public void arrowLeftTest(){
        MainMenu mainMenu = new MainMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.arrowLeft(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }

    @Test
    public void arrowRightTest(){
        MainMenu mainMenu = new MainMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.arrowRight(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }

    @Test
    public void enterTest(){
        MainMenu mainMenu = new MainMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.enter(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }

    @Test
    public void escTest(){
        MainMenu mainMenu = new MainMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.esc(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }

    @Test
    public void exitTest(){
        MainMenu mainMenu = new MainMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.exit(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }
}

