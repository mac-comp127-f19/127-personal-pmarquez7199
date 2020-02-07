package basicjava;

import java.util.Scanner;

public class SeriesSum {
    public static void main(String [] args) {
        double i = 2;
        double s = 0;
        for (i=2; i<=10; i++)
            s = s + 1/i;
        System.out.println(s);
    }
}