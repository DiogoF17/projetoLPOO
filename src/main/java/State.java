public abstract class  State {

    public State() {
    }

    abstract void arrowUp(Game game);
    abstract void arrowDown(Game game);
    abstract void arrowLeft(Game game);
    abstract void arrowRight(Game game);
    abstract void enter(Game game);
    abstract void esc(Game game);
    abstract void exit(Game game);

}
