package drawer;

import drawer.contracts.IDrawerShape;
import models.Circle;
import models.Rectangle;
import models.Triangle;
import models.contracts.ICircle;
import models.contracts.IRectangle;
import models.contracts.ITriangle;

/**
 * Created by velev on 16.5.2017 г..
 */
public class Startup {

    public static void main(String[] args) {

        ICircle circle = new Circle();
        IRectangle rectangle = new Rectangle();
        ITriangle triangle = new Triangle();

        IDrawerShape drawer = new DrawerShape();

        drawer.draw(circle);
        drawer.draw(rectangle);
        drawer.draw(triangle);
    }
}
