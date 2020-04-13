import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class HeroTest {

    Position positionMock;

    @Before
    public void setUp(){
        positionMock = Mockito.mock(Position.class);

        when(positionMock.upPosition()).thenReturn(new Position(5, 4));
        when(positionMock.downPosition()).thenReturn(new Position(5, 6));
        when(positionMock.rightPosition()).thenReturn(new Position(6, 5));
        when(positionMock.leftPosition()).thenReturn(new Position(4, 5));
    }

    @Test
    public void  upPositionTest(){
        Hero hero = new Hero(positionMock);

        Position position = hero.upPosition();

        assertEquals(5, position.getX());
        assertEquals(4, position.getY());
    }

    @Test
    public void  downPositionTest(){
        Hero hero = new Hero(positionMock);

        Position position = hero.downPosition();

        assertEquals(5, position.getX());
        assertEquals(6, position.getY());
    }

    @Test
    public void  rightPositionTest(){
        Hero hero = new Hero(positionMock);

        Position position = hero.rightPosition();

        assertEquals(6, position.getX());
        assertEquals(5, position.getY());
    }

    @Test
    public void  leftPositionTest(){
        Hero hero = new Hero(positionMock);

        Position position = hero.leftPosition();

        assertEquals(4, position.getX());
        assertEquals(5, position.getY());
    }

    @Test
    public void getPositionTest(){
        Hero hero = new Hero(positionMock);

        Position position = hero.getPosition();

        assertEquals(positionMock, position);
    }

    @Test
    public void getInitialPositionTest(){
        Hero hero = new Hero(positionMock);
        Position positionMock2 = Mockito.mock(Position.class);

        hero.setPosition(positionMock2);
        Position position = hero.getInitialPosition();

        assertEquals(positionMock, position);
    }

    @Test
    public void setPositionTest(){
        Hero hero = new Hero(positionMock);
        Position positionMock2 = Mockito.mock(Position.class);

        hero.setPosition(positionMock2);
        Position position = hero.getPosition();

        assertEquals(positionMock2, position);
    }
}
