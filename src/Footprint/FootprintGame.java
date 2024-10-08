package Footprint;

import Doctrina.Canvas;
import Doctrina.Game;

import java.awt.*;
import java.util.ArrayList;

public class FootprintGame extends Game {

    private GamePad gamePadOne;
    private GamePad gamePadTwo;
    private Player playerOne;
    private Player playerTwo;
    private ArrayList<Footprint> footprints;

    @Override
    protected void initialize() {
        gamePadOne = new GamePad();

        gamePadTwo = new GamePad();
        gamePadTwo.useWASDKeys();

        playerOne = new Player(gamePadOne);
        playerTwo = new Player(gamePadTwo);

        footprints = new ArrayList<>();
    }

    @Override
    protected void update() {
        if (gamePadOne.isQuitPressed()) {
            stop();
        }

        playerOne.update();
        if (gamePadOne.isMoving()) {
            footprints.add(playerOne.layFootprint());
        }

        playerTwo.update();
        if (gamePadTwo.isMoving()) {
            footprints.add(playerTwo.layFootprint());
        }
    }

    @Override
    protected void draw(Canvas canvas) {
        canvas.drawRectangle(0, 0, 800, 600, Color.BLUE);
        for (Footprint footprint : footprints) {
            footprint.draw(canvas);
        }
        playerOne.draw(canvas);
        playerTwo.draw(canvas);
    }
}
