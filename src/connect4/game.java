package connect4;

import comp127graphics.CanvasWindow;
import comp127graphics.Ellipse;
import comp127graphics.GraphicsGroup;
import comp127graphics.Rectangle;
import java.awt.*;
import java.awt.event.MouseEvent;

public class game {
    private static final int CANVAS_WIDTH = 600;
    private static final int CANVAS_HEIGHT = 800;
    private CanvasWindow canvas;


    grid g = new grid();

    public game(){
        canvas = new CanvasWindow("Connect Four!", CANVAS_WIDTH, CANVAS_HEIGHT);
        g.draw();
        canvas.add(g);
    }

    public static void main(String[] args){
        new game();
    }
}
