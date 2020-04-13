public class Arena extends State{

    private int width;
    private int height;

    private Hero hero;

    public Arena(int width, int height, Hero hero) {
        this.width = width;
        this.height = height;

        this.hero = hero;
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

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    void arrowUp(Game game) {
        Position position = this.hero.upPosition();
        this.hero.setPosition(position);
    }

    @Override
    void arrowDown(Game game) {
        Position position = this.hero.downPosition();
        this.hero.setPosition(position);
    }

    @Override
    void arrowLeft(Game game) {
        Position position = this.hero.leftPosition();
        this.hero.setPosition(position);
    }

    @Override
    void arrowRight(Game game) {
        Position position = this.hero.rightPosition();
        this.hero.setPosition(position);
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
