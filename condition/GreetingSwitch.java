package condition;

import java.util.*;

public class GreetingSwitch {  // Renamed class from Switch to GreetingSwitch
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int button = scanner.nextInt();  // Get user input

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("System default");
                break;
        }
    }
}
