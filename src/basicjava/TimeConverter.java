package basicjava;

import java.util.Scanner;

public class TimeConverter {
    public static int TimeConverter(int hours, int minutes, int seconds){
        minutes = minutes + (hours*60);
        seconds = seconds + (minutes*60);
        return seconds;
    }
    public static void main ( String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter hours");
        int hours = input.nextInt();

        System.out.println("Enter minutes");
        int minutes = input.nextInt();

        System.out.println("Enter seconds");
        int seconds = input.nextInt();

        int secs = TimeConverter(hours,minutes,seconds);
        System.out.println("Number of Seconds in " + hours + " hours and " + minutes + " minutes and " + seconds + " seconds: " + secs);

    }
}
