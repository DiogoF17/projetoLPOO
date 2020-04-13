public abstract class Menu extends State{
    protected int highlighted;

    protected Position position;

    public Menu(int x, int y){
        super();
        highlighted = 1;
    }

    public int getHighlighted() {
        return highlighted;
    }

    public Position getPosition() {
        return position;
    }

}
