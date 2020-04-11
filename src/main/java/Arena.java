public class Arena extends State{

    private int width;
    private int height;

    public Arena(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    void arrowUp(Game game) {

    }

    @Override
    void arrowDown(Game game) {

    }

    @Override
    void arrowLeft(Game game) {

    }

    @Override
    void arrowRight(Game game) {

    }

    @Override
    void enter(Game game) {
        //Nao acontece nada
    }

    @Override
    void esc(Game game) {
        game.changeState(new PauseMenu(game.getArena().getWidth(), game.getArena().getHeight()));
    }

    @Override
    void exit(Game game) { game.setFinish(true);}
}
