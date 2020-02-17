package basicjava;

import java.util.Random;

public class Die {
    private Random random = new Random();
    public int internalState;
    public Die(){
        internalState = -1;
    }
    public void roll(){
        internalState = random.nextInt(6);
    }
    public int getValue(){
        return internalState;
    }

    @Override
    public String toString(){
        if (getValue() == 1)
            return "one";
        else if (getValue() == 2)
            return "two";
        else if (getValue() == 3)
            return "three";
        else if (getValue() == 4)
            return "four";
        else if (getValue() == 5)
            return "five";
        else if (getValue() == 6)
            return "six";
        else
            return "not rolled";
    }

}
