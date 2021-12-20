import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class S04CustomCircle extends GraphicsApp {

    private BouncingCircle circle;
   
    @Override
    public void initialize() {
        setCanvasSize(500, 500);
        circle = new BouncingCircle(getWidth()/2, getHeight()/2, 30, Colors.YELLOW, getWidth());
    }

    @Override
    public void draw() {
        drawBackground(Colors.BLACK);
        circle.update();
        circle.draw();
    }

    public static void main(String[] args) {
        GraphicsAppLauncher.launch("S04CustomCircle");
    }
}
