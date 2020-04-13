import com.sun.tools.javac.Main;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

public class GameTest {

    Arena arenaMock;
    List<GameObserver> gameObservers;

    @Before
    public void setUp(){
        arenaMock = Mockito.mock(Arena.class);
    }

    @Test
    public void getFinishTest() {
        Game game = new Game(arenaMock);

        assertFalse(game.getFinish());
    }

    @Test
    public void setFinishTest() {
        Game game = new Game(arenaMock);

        game.setFinish(true);
        assertTrue(game.getFinish());
    }

    @Test
    public void getArenaTest() {
        Game game = new Game(arenaMock);

        Arena arena = game.getArena();

        assertEquals(arenaMock, arena);
    }

    @Test
    public void setArenaTest() {
        Game game = new Game(arenaMock);
        Arena arenaMock2 = Mockito.mock(Arena.class);

        game.setArena(arenaMock2);
        Arena arena = game.getArena();

        assertEquals(arenaMock2, arena);
    }

    @Test
    public void changeStateTest(){
        Game game = new Game(arenaMock);
        MainMenu stateMock = Mockito.mock(MainMenu.class);

        game.changeState(stateMock);
        State state = game.getState();

        assertEquals(stateMock, state);
    }

    @Test
    public void getStateTest(){
        Game game = new Game(arenaMock);

        State state = game.getState();

        assertEquals(MainMenu.class, state.getClass());
    }

    @Test
    public void arrowDownTest(){

    }

    @Test
    public void arrowUpTest(){
    }

    @Test
    public void arrowLeftTest(){

    }

    @Test
    public void arrowRightTest(){

    }

    @Test
    public void enterTest(){

    }

    @Test
    public void escTest(){

    }

    @Test
    public void exitTest(){

    }
}
