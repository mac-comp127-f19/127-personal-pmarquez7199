package basicjava;

import java.util.Scanner;

public class SquareNums {
    public static void main (String [] args) {
        double num;
        double square;
        do {
            Scanner input = new Scanner(System.in);

            System.out.println("enter number");
            num = input.nextInt();
            square = num*num;
            System.out.println("number squared =" + square);
        }
        while (square%4 != 0);
    }
}
