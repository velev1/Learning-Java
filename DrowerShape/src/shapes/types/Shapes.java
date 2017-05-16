package shapes.types;

/**
 * Created by velev on 16.5.2017 г..
 */

import models.contracts.IShape;

public enum Shapes {
    Circle {
        @Override
        public void drawShape() {
            System.out.println("this is circle");
        }
    },
    Rectangle {
        @Override
        public void drawShape() {
            System.out.println("this is rectangle");
        }
    },
    Triangle {

    };

    public void drawShape() {
        System.out.println("This is the default draw in shapes");
    }
}

