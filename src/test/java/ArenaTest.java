import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class ArenaTest {

    Hero heroMock;
    Position positionMock;
    Game gameMock;
    Arena arenaMock;

    @Before
    public void setUp(){
        heroMock = Mockito.mock(Hero.class);
        positionMock = Mockito.mock(Position.class);
        gameMock = Mockito.mock(Game.class);
        arenaMock = Mockito.mock(Arena.class);

        when(heroMock.upPosition()).thenReturn(positionMock);
        when(heroMock.downPosition()).thenReturn(positionMock);
        when(heroMock.rightPosition()).thenReturn(positionMock);
        when(heroMock.leftPosition()).thenReturn(positionMock);

        when(gameMock.getArena()).thenReturn(arenaMock);

        when(arenaMock.getWidth()).thenReturn(5);
        when(arenaMock.getHeight()).thenReturn(5);
    }

    @Test
    public void getWidthTest(){
        Arena arena = new Arena(5, 9, heroMock);

        int val = arena.getWidth();

        assertEquals(5, val);
    }

    @Test
    public void setWidthTest(){
        Arena arena = new Arena(5, 9, heroMock);

        arena.setWidth(3);
        int val = arena.getWidth();

        assertEquals(3, val);
    }

    @Test
    public void getHeightTest(){
        Arena arena = new Arena(5, 9, heroMock);

        int val = arena.getHeight();

        assertEquals(9, val);
    }

    @Test
    public void setHeightTest(){
        Arena arena = new Arena(5, 9, heroMock);

        arena.setHeight(3);
        int val = arena.getHeight();

        assertEquals(3, val);
    }

    @Test
    public void getHeroTest(){
        Arena arena = new Arena(5, 9, heroMock);

        Hero hero = arena.getHero();

        assertEquals(heroMock, hero);
    }

    @Test
    public void setHeroTest(){
        Arena arena = new Arena(5, 9, heroMock);
        Hero heroMock2 = Mockito.mock(Hero.class);

        arena.setHero(heroMock2);
        Hero hero = arena.getHero();

        assertEquals(heroMock2, hero);
    }

    @Test
    public void arrowUpTest(){
        Arena arena = new Arena(5, 9, heroMock);

        arena.arrowUp(gameMock);
        Mockito.verify(heroMock, times(1)).setPosition(positionMock);
    }

    @Test
    public void arrowDownTest(){
        Arena arena = new Arena(5, 9, heroMock);

        arena.arrowDown(gameMock);
        Mockito.verify(heroMock, times(1)).setPosition(positionMock);
    }

    @Test
    public void arrowRightTest(){
        Arena arena = new Arena(5, 9, heroMock);

        arena.arrowRight(gameMock);
        Mockito.verify(heroMock, times(1)).setPosition(positionMock);
    }

    @Test
    public void arrowLeftTest(){
        Arena arena = new Arena(5, 9, heroMock);

        arena.arrowLeft(gameMock);
        Mockito.verify(heroMock, times(1)).setPosition(positionMock);
    }

    @Test
    public void enterTest(){
        Arena arena = new Arena(5, 9, heroMock);

        arena.enter(gameMock);
    }

    @Test
    public void escTest(){
        Arena arena = new Arena(5, 9, heroMock);

        arena.esc(gameMock);
        Mockito.verify(gameMock, times(1)).changeState(any(PauseMenu.class));
    }

    @Test
    public void exitTest(){
        Arena arena = new Arena(5, 9, heroMock);

        arena.exit(gameMock);
        Mockito.verify(gameMock, times(1)).setFinish(true);
    }
}
