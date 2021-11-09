import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter first digit ");
        x = inScanner.nextInt();
        System.out.println("Enter second digit");
        y = inScanner.nextInt();

        if (Math.abs(x) > Math.abs(y)) {
            System.out.println(x + " magnitude is greater than " + y);
        }
        else if ((Math.abs(x)) < Math.abs(y)) {
    System.out.println(y + " magnitude is greater than " + x);
        }
        else if (x == y) {
            System.out.println(x + "equals to "+ y);
        }


    }
}
