package basicjava;

public class DiceRoller2 {
    public static void main(String[] args){
        MoreSidesDie die1 = new MoreSidesDie(10);
        for (int j = 1; j < 11; j++){
            die1.roll();
            System.out.println("Roll " + j + " generated a " + die1.toString());
        }
        MoreSidesDie die2 = new MoreSidesDie(8);
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
