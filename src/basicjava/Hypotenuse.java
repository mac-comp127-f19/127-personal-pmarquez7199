package basicjava;
import java.lang.Math;
import java.util.Scanner;

public class Hypotenuse {
    public static double calculateHypotenuse (double length1, double length2) {
        double hypotenuse = Math.sqrt((length1*length1)+(length2*length2));
        return hypotenuse;
    }
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side length");
        double length1 = input.nextDouble();

        System.out.println("Enter side length");
        double length2 = input.nextDouble();

        double hyp = calculateHypotenuse(length1,length2);
        System.out.println("Hypotenuse: " + hyp );
    }
}
