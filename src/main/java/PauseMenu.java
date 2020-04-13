public class PauseMenu extends Menu{

    public PauseMenu(int x, int y) {
        super(x, y);

        position = new Position(x/2-4, y/4-1);
    }

    @Override
    void arrowUp(Game game) {
        if(this.highlighted == 1)
            this.highlighted = 4;
        else
            this.highlighted--;
    }

    @Override
    void arrowDown(Game game) {
        if(this.highlighted == 4)
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
            Arena arena = new Arena(game.getArena().getWidth(), game.getArena().getHeight(), new Hero(game.getArena().getHero().getInitialPosition()));
            game.changeState(arena);
            game.setArena(arena);
        }
        else if(highlighted == 3)
            game.changeState(new MainMenu(game.getArena().getWidth(), game.getArena().getHeight()));
        else
            game.setFinish(true);
    }

    @Override
    void esc(Game game) {
        game.changeState(game.getArena());
    }

    @Override
    void exit(Game game) { game.setFinish(true);}
}
