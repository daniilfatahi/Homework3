import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter your digit: ");
        int number = inScanner.nextInt();

        if (number % 2 == 0)
        {
            System.out.println("The number is even!");
        }
        else if (number % 2 != 0)
        {
            System.out.println("The number is odd!");
        }








    }
}
