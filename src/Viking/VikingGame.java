package Viking;

import Doctrina.Canvas;
import Doctrina.Game;
import MovingRectangle.GamePad;
import MovingRectangle.Player;

public class VikingGame extends Game {
    private Player player;
    private GamePad gamePad;

    @Override
    protected void initialize() {
        gamePad = new GamePad();
        player = new Player(gamePad);
    }

    @Override
    protected void update() {
        if (gamePad.isQuitPressed()) {
            stop();
        }
        player.update();
    }

    @Override
    protected void draw(Canvas canvas) {

    }
}
