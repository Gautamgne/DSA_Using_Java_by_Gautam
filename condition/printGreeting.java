package condition;

import java.util.*;
public class printGreeting {
    public static void main(String[] args) {
        System.out.println("Enter Number any numberfrom 1-3");
        Scanner sc = new Scanner (System.in);
        int num= sc.nextInt();
        if (num == 1) {
            System.out.println("Hello");
        }
        else if (num == 2) {
            System.out.println("Nameste");
        }
        else if (num == 3) {
            System.out.println("Bonjour");;
            }else {
                System.out.println("Invalid input");
        }
    }
}
