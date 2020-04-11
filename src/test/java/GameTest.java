import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

public class GameTest {

    Game game;

    List<GameObserver> gameObservers;

    @Before
    public void setUp(){
        Arena arena = Mockito.mock(Arena.class);
        game = new Game(arena);

        gameObservers = new ArrayList<>();

        gameObservers.add(new Application());
        gameObservers.add(new Application());
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
