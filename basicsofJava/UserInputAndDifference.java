import java.util.Scanner;

public class UserInputAndDifference { // Descriptive class name

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = sc.nextInt(); // Read input from the user

        int b = 19;

        System.out.println("The number you entered is: " + a);
        System.out.println("The difference of " + a + " and " + b + " is: " + (a - b)); // More descriptive output
    }
}