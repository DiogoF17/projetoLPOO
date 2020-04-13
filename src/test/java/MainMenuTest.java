import com.sun.tools.javac.Main;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MainMenuTest {

    Game gameMock;
    Arena arenaMock;
    Hero heroMock;
    Position positionMock;

    @Before
    public void setUp(){
        gameMock = Mockito.mock(Game.class);
        arenaMock = Mockito.mock(Arena.class);
        heroMock = Mockito.mock(Hero.class);
        positionMock = Mockito.mock(Position.class);

        when(heroMock.getInitialPosition()).thenReturn(positionMock);

        when(arenaMock.getWidth()).thenReturn(5);
        when(arenaMock.getHeight()).thenReturn(5);
        when(arenaMock.getHero()).thenReturn(heroMock);

        when(gameMock.getArena()).thenReturn(arenaMock);
    }

    @Test
    public void arrowDownTest(){
        MainMenu mainMenu = new MainMenu(5, 6);

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

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.arrowLeft(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }

    @Test
    public void arrowRightTest(){
        MainMenu mainMenu = new MainMenu(5, 6);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.arrowRight(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }

    @Test
    public void enterTest(){
        MainMenu mainMenu = new MainMenu(5, 6);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.enter(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

        mainMenu.arrowDown(gameMock);
        mainMenu.enter(gameMock);
        assertEquals(2, mainMenu.getHighlighted());

    }

    @Test
    public void escTest(){
        MainMenu mainMenu = new MainMenu(5, 6);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.esc(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }

    @Test
    public void exitTest(){
        MainMenu mainMenu = new MainMenu(5, 6);

        assertEquals(1, mainMenu.getHighlighted());
        assertEquals(-2, mainMenu.getPosition().getX());
        assertEquals(0, mainMenu.getPosition().getY());

        mainMenu.exit(gameMock);
        assertEquals(1, mainMenu.getHighlighted());

    }

}

