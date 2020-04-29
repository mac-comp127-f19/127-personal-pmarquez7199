package connect4;

import comp127graphics.Point;

public class grid {

    private int numRows, numColumns;
    private Token tokens[][];

    public grid(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        tokens = new Token[numRows][numColumns];
    }
}