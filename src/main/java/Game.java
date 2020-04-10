public class Game {

    State state;
    private boolean finish;
    Arena arena;

    public Game(Arena arena){
        this.state = new MainMenu(arena.getWidth(), arena.getHeight());
        this.arena = arena;
        this.finish = false;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public void changeState(State state){
        this.state = state;
    }

    public void arrowUp(){
        this.state.arrowUp(this);
    }

    public void arrowDown(){
        this.state.arrowDown(this);
    }

    public void arrowLeft(){
        this.state.arrowLeft(this);
    }

    public void arrowRight(){
        this.state.arrowRight(this);
    }

    public void enter(){
        this.state.enter(this);
    }

    public void esc(){
        this.state.esc(this);
    }

}
