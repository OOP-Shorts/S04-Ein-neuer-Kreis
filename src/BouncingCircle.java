import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.graphics.Circle;

public class BouncingCircle {

    private Circle shape;
    private int worldWidth;
    private int xVelocity = 1;

    public BouncingCircle(int x, int y, int radius, Color color, int worldWidth) {
        this.worldWidth = worldWidth;
        shape = new Circle(x,y,radius,color);
    }

    public void update() {
        if(shape.getXPos() + shape.getRadius() >= worldWidth) {
            xVelocity = -1;
        } else if (shape.getXPos() - shape.getRadius() <= 0) {
            xVelocity = 1;
        }
        shape.move(xVelocity, 0);
    }

    public void draw() {
        shape.draw();
    }

}
