package Viking;

import Doctrina.Canvas;
import Doctrina.CollidableRepository;
import Doctrina.StaticEntity;

import java.awt.*;

public class Blockade extends StaticEntity {

    public Blockade() {
        CollidableRepository.getInstance().registerEntity(this);
    }

    private final Color blockadeColor = new Color(255, 0, 0, 125);

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRectangle(this, blockadeColor);
    }
}
