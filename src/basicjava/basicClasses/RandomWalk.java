package basicjava.basicClasses;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int internalState;
    private int max;
    private int min;

    /**
     * Creates a new random walk starting with some initial value.
     */
    public RandomWalk(int n,int min, int max) {
        rng = new Random();
        internalState = n;
    }

    /**
     * @return the current value for the random walk.
     */
    public int getValue() {
        return internalState;
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     * TODO: Complete me.
     * @return Updated value.
     */
    public int advanceValue() {
        if (rng.nextBoolean()){
            internalState++;
            }
        else{
            internalState--;
            }
        return getValue();
    }
}

