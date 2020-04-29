import java.util.Random;
import java.util.Scanner;

public class scratchwork {
    public static void main(String[] args) {
        Random ran = new Random();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the upper limit for the random number generator: ");

        int input = scan.nextInt();

        int newnumber = ran.nextInt(input);

        System.out.println(newnumber);
    }
}
