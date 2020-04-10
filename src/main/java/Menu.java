public abstract class Menu extends State{
    protected int highlighted;

    protected String text;

    protected Position position;

    public Menu(int x, int y){
        super();
        highlighted = 1;
    }

    public int getHighlighted() {
        return highlighted;
    }

    public void setHighlighted(int highlighted) {
        this.highlighted = highlighted;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
