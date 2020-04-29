package connect4;

import comp127graphics.GraphicsGroup;
import comp127graphics.Rectangle;

public class grid extends GraphicsGroup {
    int height = 6;
    int width = 7;
    public void draw(){
        for (int i = 0; i<width; i++){
            for (int j = 0; i<height; j++){
                Rectangle square = new Rectangle(0+(5+5)*i,0+(5+5)*j,5,5);
                square.setFilled(true);
                add(square);
            }
        }
    }
}
