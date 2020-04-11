public class MainMenu extends Menu{

    public MainMenu(int x, int y) {
        super(x, y);

        position = new Position(x/2-4, y/4-1);
    }

    @Override
    void arrowUp(Game game) {
        if(this.highlighted == 1)
            this.highlighted = 2;
        else
            this.highlighted--;
    }

    @Override
    void arrowDown(Game game) {
        if(this.highlighted == 2)
            this.highlighted = 1;
        else
            this.highlighted++;
    }

    @Override
    void arrowLeft(Game game) {
        //Nao acontece nada
    }

    @Override
    void arrowRight(Game game) {
        //Nao acontece nada
    }

    @Override
    void enter(Game game) {
        if(this.highlighted == 1)
            game.changeState(game.getArena());
        else
            game.setFinish(true);

    }

    @Override
    void esc(Game game) {
        //Nao acontece nada
    }

    @Override
    void exit(Game game) { game.setFinish(true);}
}
