import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter your variable: ");
        int mark = inScanner.nextInt();

        if (mark >= 50)
            System.out.println("PASS");
        else
        {
            System.out.println("FAIL");

        }
        System.out.println("DONE");


    }
}
