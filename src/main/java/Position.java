import java.util.Objects;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Position upPosition(){
        return new Position(this.getX(), this.getY() - 1);
    }

    public Position downPosition(){
        return new Position(this.getX(), this.getY() + 1);
    }

    public Position rightPosition(){
        return new Position(this.getX() + 1, this.getY());
    }

    public Position leftPosition(){
        return new Position(this.getX() - 1, this.getY());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x &&
                y == position.y;
    }

}
