package ForLoopExamples;

public class Number { // Class name updated to follow Java conventions
    public static void main(String[] args) {
        // Print numbers 1 to 10 in a row
        for (int counter = 5; counter <= 10; counter++) {
            System.out.print("Gautam" + " "); // Print numbers on the same line with spaces
        }
        System.out.println(); // Move to the next line after printing the row

        // Print numbers 1 to 10 in a column
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("Gautam"); // Print each number on a new line
        }
    }
}
