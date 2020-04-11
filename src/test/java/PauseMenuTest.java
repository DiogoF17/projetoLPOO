import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class PauseMenuTest {

    @Test
    public void arrowDownTest(){
        PauseMenu pauseMenu = new PauseMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, pauseMenu.getHighlighted());
        assertEquals(-2, pauseMenu.getPosition().getX());
        assertEquals(0, pauseMenu.getPosition().getY());

        pauseMenu.arrowDown(gameMock);
        assertEquals(2, pauseMenu.getHighlighted());

        pauseMenu.arrowDown(gameMock);
        assertEquals(3, pauseMenu.getHighlighted());

        pauseMenu.arrowDown(gameMock);
        assertEquals(4, pauseMenu.getHighlighted());

        pauseMenu.arrowDown(gameMock);
        assertEquals(1, pauseMenu.getHighlighted());
    }

    @Test
    public void arrowUpTest(){
        PauseMenu pauseMenu = new PauseMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, pauseMenu.getHighlighted());
        assertEquals(-2, pauseMenu.getPosition().getX());
        assertEquals(0, pauseMenu.getPosition().getY());

        pauseMenu.arrowUp(gameMock);
        assertEquals(4, pauseMenu.getHighlighted());

        pauseMenu.arrowUp(gameMock);
        assertEquals(3, pauseMenu.getHighlighted());

        pauseMenu.arrowUp(gameMock);
        assertEquals(2, pauseMenu.getHighlighted());

        pauseMenu.arrowUp(gameMock);
        assertEquals(1, pauseMenu.getHighlighted());
    }

    @Test
    public void arrowLeftTest(){
        PauseMenu pauseMenu = new PauseMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, pauseMenu.getHighlighted());
        assertEquals(-2, pauseMenu.getPosition().getX());
        assertEquals(0, pauseMenu.getPosition().getY());

        pauseMenu.arrowLeft(gameMock);
        assertEquals(1, pauseMenu.getHighlighted());

    }

    @Test
    public void arrowRightTest(){
        PauseMenu pauseMenu = new PauseMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, pauseMenu.getHighlighted());
        assertEquals(-2, pauseMenu.getPosition().getX());
        assertEquals(0, pauseMenu.getPosition().getY());

        pauseMenu.arrowRight(gameMock);
        assertEquals(1, pauseMenu.getHighlighted());

    }

    @Test
    public void enterTest(){
        PauseMenu pauseMenu = new PauseMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, pauseMenu.getHighlighted());
        assertEquals(-2, pauseMenu.getPosition().getX());
        assertEquals(0, pauseMenu.getPosition().getY());

        pauseMenu.enter(gameMock);
        assertEquals(1, pauseMenu.getHighlighted());

    }

    @Test
    public void escTest(){
        PauseMenu pauseMenu = new PauseMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, pauseMenu.getHighlighted());
        assertEquals(-2, pauseMenu.getPosition().getX());
        assertEquals(0, pauseMenu.getPosition().getY());

        pauseMenu.esc(gameMock);
        assertEquals(1, pauseMenu.getHighlighted());

    }

    @Test
    public void exitTest(){
        PauseMenu pauseMenu = new PauseMenu(5, 6);
        Game gameMock = Mockito.mock(Game.class);

        assertEquals(1, pauseMenu.getHighlighted());
        assertEquals(-2, pauseMenu.getPosition().getX());
        assertEquals(0, pauseMenu.getPosition().getY());

        pauseMenu.exit(gameMock);
        assertEquals(1, pauseMenu.getHighlighted());

    }
}

