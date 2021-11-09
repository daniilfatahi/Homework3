import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        float a;
        float b;


        Scanner inScanner = new Scanner(System.in);
        System.out.println("Now we will do your basic equation a*x+b=0, but first enter A: ");
        a = inScanner.nextInt();
        System.out.println("Enter B: ");
        b = inScanner.nextInt();

        if (a != 0) {
            System.out.println("The result is: "+ (-b/a));
        } else {
            System.out.println("The result is infinity");
        }



    }
}
