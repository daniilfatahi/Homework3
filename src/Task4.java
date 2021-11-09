import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner inScanner = new Scanner(System.in);

        System.out.println("Enter x: ");
        x = inScanner.nextInt();
        System.out.println("Enter y: ");
        y = inScanner.nextInt();

        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else if (x < y) {
                System.out.println(y + " is greater than " + x);
        } else if (x == y){
            System.out.println(x + " equal to " + y);
        }


    }
}
