package drawer;

import drawer.contracts.IDrawerShape;
import models.contracts.IShape;
import shapes.types.Shapes;

/**
 * Created by velev on 16.5.2017 г..
 */
public class DrawerShape implements IDrawerShape {

    @Override
    public void draw(IShape shape) {

        Shapes shapeType = Shapes.valueOf(shape.getClass().getSimpleName());

        shapeType.drawShape();
    }
}
