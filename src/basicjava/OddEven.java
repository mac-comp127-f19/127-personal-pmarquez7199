package basicjava;

import java.util.Scanner;

public class OddEven {
    public static boolean isOdd(int number){
        int c = number % 2;
        if (c != 0)
            return true;
        else
            return false;

    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int number = input.nextInt();

        boolean num = isOdd(number);
        if (num==true)
            System.out.println("Wow, that's odd!");
        /*
        if (num == true)
            System.out.println("That is odd");
        else
            System.out.println("That is even");
         */

    }

}
