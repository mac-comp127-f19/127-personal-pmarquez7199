package basicjava;

public class SeriesSum2 {
    public static void main(String [] args) {
        double i = 2;
        double s = 0;
        do {
            for (i=2; i<=10; i++)
                s = s + 1/i;
            System.out.println(s);
        }
        while (s<2);
    }
}