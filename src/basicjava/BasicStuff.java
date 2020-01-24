package basicjava;
import java.lang.Math;

/**
 * Created by pmarquez on 1/24/20
 */
public class BasicStuff {
    public static void main(String[] args) {
        double age0 = 20, age1 = 21;
        System.out.println("we are " + age0 + "and " + age1 + " years old");

        double sumOfAges = age0 + age1;
        System.out.println("The sum of our ages is " + sumOfAges);

        System.out.println("The sum of our ages is " + (age0 + age1));

        System.out.println(6 / 3);

        System.out.println((float) 6 / 4);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE - 1);

        int hours;
        int days;
        int weeks;

        days = 1600 / 24;
        hours = 1600 - (days*24);
        weeks = days / 7;
        days = days - (weeks * 7);
        System.out.println("weeks: " + weeks );
        System.out.println("days: " + days );
        System.out.println("hours: " + hours );


        double h = 5;
        double r = 2;
        double V;
        double A;
        A = (3.1415 * r * r) + (3.1415 * r * (Math.sqrt((r * r) + (h * h))));
        V = ((float)1 / 3) * 3.1415 * r * r * h;
        System.out.println("The volume of the cone is " + V + ".");
        System.out.println("The area of the cone is " + A + ".");
    }
}

// with int 20 and 21 printed as 20 and 21
// with double 20 and 32 printed as 20.0 and 21.0
// 6/4 printed as 1 rather than 1.5 --> need to use (float) in front of 6/4 to make it 1.5
//Integer.MAX_VALUE is the largest value that a int primitive can contain --> 2147483647
//Integer.MAX_VALUE - 1 gives 2147483646 --> we get this because it is just subtracting one from the value






