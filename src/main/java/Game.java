import java.util.ArrayList;
import java.util.List;

public class Game {

    State state;
    private boolean finish;
    Arena arena;

    private List<GameObserver> gameObservers;

    public Game(Arena arena){
        this.state = new MainMenu(arena.getWidth(), arena.getHeight());
        this.arena = arena;
        this.finish = false;

        gameObservers = new ArrayList<>();
    }

    public boolean getFinish() {
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

    public State getState(){return this.state;}

    public void arrowUp(){
        this.state.arrowUp(this);
        this.notifyObserver();
    }

    public void arrowDown(){
        this.state.arrowDown(this);
        this.notifyObserver();
    }

    public void arrowLeft(){
        this.state.arrowLeft(this);
        this.notifyObserver();
    }

    public void arrowRight(){
        this.state.arrowRight(this);
        this.notifyObserver();
    }

    public void enter(){
        this.state.enter(this);
        this.notifyObserver();
    }

    public void esc(){
        this.state.esc(this);
        this.notifyObserver();
    }

    public void exit(){
        this.state.exit(this);
        this.notifyObserver();
    }

    public void addObserver(GameObserver gameObserver){gameObservers.add(gameObserver);}

    private void notifyObserver(){
        for(GameObserver gameObserver:gameObservers)
            gameObserver.gameChanged();
    }

}
