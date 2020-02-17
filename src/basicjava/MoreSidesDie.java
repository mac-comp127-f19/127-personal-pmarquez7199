package basicjava;

import java.util.Random;

public class MoreSidesDie {

    private Random random = new Random();
    public int internalState;
    public int sides;
    public MoreSidesDie(int n){
        internalState = -1;
        sides = n;
    }
    public void roll(){
        internalState = random.nextInt(sides);
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
        else if (getValue() == 7)
            return "seven";
        else if (getValue() == 8)
            return "eight";
        else if (getValue() == 9)
            return "nine";
        else if (getValue() == 10)
            return "ten";
        else if (getValue() == 11)
            return "eleven";
        else if (getValue() == 12)
            return "twelve";
        else if (getValue() == -1)
            return "not rolled";
        else
            return "rolled:" + getValue();
    }

}

