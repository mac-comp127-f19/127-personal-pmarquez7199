package connect4;
import comp127graphics.*;
import comp127graphics.Image;
import comp127graphics.Rectangle;
import comp127graphics.events.MouseButtonEvent;
import comp127graphics.events.MouseButtonEventHandler;
import comp127graphics.ui.Button;

import java.awt.*;

public class game {

    private static final int CANVAS_WIDTH = 1200;
    private static final int CANVAS_HEIGHT = 700;

    private static final int INITIAL_GRID_X = 250;
    private static final int INITIAL_GRID_Y = 50;

    private static final int SQUARE_WIDTH = 100;
    private static  final Color SQUARE_COLOR = Color.BLUE;

    private static final int GAME_ROWS = 6;
    private static final int GAME_COLUMNS = 7;

    private static final int TOKEN_POSITION_X = 265;
    private static final int TOKEN_POSITION_Y = 65;

    Color col;

    private CanvasWindow canvas;

    private Button playerButton;

    private grid grid;

//    private Image YOU_LOST = new Image(0, 400, "youdied.jpg");
//    private Image YOU_WIN = new Image(72, 200, "youwin.jpg");


    private boolean running = true;
    private boolean win = false;

    public game() {
        canvas = new CanvasWindow("Connect Four!", CANVAS_WIDTH, CANVAS_HEIGHT);
        //grid = new grid(GAME_ROWS, GAME_COLUMNS);
        this.buildVisualGrid();
        //tokenGrid();
        Token t = new Token(265,65);
        t.setFillColor(Color.white);
        canvas.add(t);
        canvas.onClick(event -> t.setFillColor(col));
        addPlayerButton(Color.red,"Player 1",100);
        addPlayerButton(Color.yellow,"Player 2",200);

        //Mouse Input
        canvas.onMouseDown(new MouseButtonEventHandler() {
            @Override
            public void handleEvent(MouseButtonEvent event) {
                System.out.println(event.getPosition());
            }
        });

//        canvas.animate(new Runnable() {
//            @Override
//            public void run () {
//                if(running) {
//                    input();
//                    tick();
//                } else {
//                    endGame(win);
//                }
//            }
//        });

    }

    private void buildVisualGrid(){
        for(int r = 0; r < GAME_ROWS; r++){
            for(int c = 0; c < GAME_COLUMNS; c++){
                Rectangle rect = new Rectangle(INITIAL_GRID_X+(c*SQUARE_WIDTH),
                        INITIAL_GRID_Y+(r*SQUARE_WIDTH),
                        SQUARE_WIDTH, SQUARE_WIDTH);
                rect.setStrokeColor(Color.BLACK);
                rect.setStrokeWidth(5);
                rect.setFillColor(SQUARE_COLOR);
                this.canvas.add(rect);
            }
        }
    }
    private void tokenGrid(){
        for(int r = 0; r < GAME_ROWS; r++){
            for(int c = 0; c < GAME_COLUMNS; c++){
                Token t = new Token(265+(c*100), 65+(r*100));
                t.setFillColor(Color.WHITE);
                this.canvas.add(t);
            }
        }
    }
    private void addPlayerButton(Color color, String name, double y){
        playerButton = new Button(name);
        playerButton.setPosition(10,y);
        canvas.add(playerButton);
        playerButton.onClick(()->col=color);
    }

    public static void main(String[] args){
        new game();
    }
}