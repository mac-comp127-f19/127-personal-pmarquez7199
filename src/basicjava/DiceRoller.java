package basicjava;

public class DiceRoller {
    public static void main(String[] args){
        Die die1 = new Die();
        for (int j = 1; j < 11; j++){
            die1.roll();
            System.out.println("Roll " + j + " generated a " + die1.toString());
        }
        Die die2 = new Die();
        int count = 0;
        for (int i =1; i <1000001; i++){
            die1.roll();
            die2.roll();
            if (die1.toString() == die2.toString())
                count++;
        }
        System.out.println("In 1,000,000 rolls, two dice agreed " + count + " times");
    }
}
