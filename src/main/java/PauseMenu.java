public class PauseMenu extends Menu{

    public PauseMenu(int x, int y) {
        super(x, y);
        text = "PAUSE MENU\n\nResume\nRestart\nExit";

        position = new Position(x-4, y-1);
    }

    @Override
    void arrowUp(Game game) {
        if(this.highlighted == 1)
            this.highlighted = 3;
        else
            this.highlighted--;
    }

    @Override
    void arrowDown(Game game) {
        if(this.highlighted == 3)
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
        if(highlighted == 1)
            game.changeState(game.getArena());
        else if(highlighted == 2) {
            Arena arena = new Arena(game.getArena().getWidth(), game.getArena().getHeight());
            game.changeState(arena);
            game.setArena(arena);
        }
        else
            game.setFinish(true);
    }

    @Override
    void esc(Game game) {
        game.changeState(game.getArena());
    }
}
