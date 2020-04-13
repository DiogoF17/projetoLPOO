public class Hero {

    private Position position, initialPosition;

    public Hero(Position position) {
        this.position = position;
        this.initialPosition = position;
    }

    public Position getPosition() {
        return position;
    }

    public Position getInitialPosition(){
        return initialPosition;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position upPosition(){
        return position.upPosition();
    }

    public Position downPosition(){
        return position.downPosition();
    }

    public Position rightPosition(){
        return position.rightPosition();
    }

    public Position leftPosition(){
        return position.leftPosition();
    }
}
