package basicjava;

public class DoNDrills {
    public static void main(String[] args) {
        for (int count = 0; count <10; count++)
            System.out.println(count);

        for (int count = 10; count >= 0; count--)
            System.out.println(count);

        for (int count = 1; count <= 256; count = count*2)
            System.out.println(count);

        for (int count = 0; count <= 255; count = (count*2)+1)
            System.out.println(count);

        for (int count = 1; count <= 50; count = count+2 )
            System.out.println(Math.sqrt(count));
    }
}
