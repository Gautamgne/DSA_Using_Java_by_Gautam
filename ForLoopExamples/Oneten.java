package ForLoopExamples;

public class OneTen { // Class name matches file name
    public static void main(String[] args) {
        // Using a do-while loop to print numbers from 0 to 10
        System.out.println("Using do-while loop:");
        int k = 0;
        do {
            System.out.print(k + " "); // Print each number followed by a space
            k++; //

        } while (k < 11);
        System.out.println(); // Move to the next line

        // Using a for loop to print numbers from 0 to 10
        System.out.println("Using for loop:");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line

        // Using a while loop to print numbers from 0 to 10
        System.out.println("Using while loop:");
        int j = 0;
        while (j < 11) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println(); // Move to the next line
    }
}
