package connect4;

import comp127graphics.Ellipse;

import java.awt.*;

public class Token extends Ellipse{

    private static final int TOKEN_RADIUS = 70;

    private Color color;
    private double rectX, rectY;

    public Token(int x, int y){
        super(x, y, TOKEN_RADIUS, TOKEN_RADIUS);
    }

    public void setPosition(int x, int y){
        rectX = x;
        rectY = y;
    }
}