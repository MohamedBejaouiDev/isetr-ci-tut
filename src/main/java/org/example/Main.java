import java.util.*;
import java.io.*;

public class Main {

    // Bad: Unused field
    public static int unusedField = 42;

    // Bad: Public mutable field
    public List<String> names = new ArrayList<>();

    // Bad: Constant naming style
    public static final int badConstant = 123;

    // Bad: Very long and unnecessary method
    public static void main(String[] args) {

        // Unused variables
        int a = 10;
        int b = 20;

        // Redundant scanner
        Scanner sc = new Scanner(System.in);

        // Empty try-catch block
        try {
            int x = 1 / 0; // division by zero
        } catch (Exception e) {
            // empty catch = bad practice
        }

        // Duplicated code block
        System.out.println("Starting program...");
        System.out.println("Starting program...");

        // Strange logic
        for (int i = 0; i < 5; i++) {
            if (i == 2) break;
            if (i == 2) break; // Duplicate condition
        }

        // Creating an object multiple times unnecessarily
        Random rand = new Random();
        Random rand2 = new Random(); // redundant

        // Very long loop with pointless operations
        for (int i = 0; i < 50; i++) {
            int number = rand.nextInt(100);
            System.out.println("Number is: " + number);

            // Bad: nested ifs with no purpose
            if (number > 10) {
                if (number > 20) {
                    if (number > 30) {
                        if (number > 40) {
                            System.out.println("Large number");
                        }
                    }
                }
            }

            // Unreachable code
            if (false) {
                System.out.println("I will never run");
            }
        }

        // Opened but not closed file reader
        FileReader fr = null;
        try {
            fr = new FileReader("non_existing_file.txt");
            int data = fr.read();
            while (data != -1) {
                data = fr.read();
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        // Bad: resource leak (fr not closed)
        // Bad: magic numbers
        int result = calculate(5, 10);
        int result2 = calculate(5, 10); // duplicated call

        // Bad: deep nesting
        if (result > 10) {
            if (result > 20) {
                if (result > 30) {
                    if (result > 40) {
                        System.out.println("Deep nesting detected");
                    }
                }
            }
        }

        // Bad unused method result
        unusedMethod();

        System.out.println("Program ended.");
    }

    // Bad: too many parameters
    public static int calculate(int x, int y) {

        // Bad practice: modify parameters (not visible here but bad anyway)
        int r = x + y;

        // More bad code
        if (r > 10) {
            r += 5;
        } else {
            r -= 5;
        }

        // Bad: duplicated logic
        if (r > 10) {
            r += 5;
        } else {
            r -= 5;
        }

        return r;
    }

    // Unused method
    public static void unusedMethod() {
        int unused1 = 0;
        int unused2 = 1;
        int unused3 = unused1 + unused2;
        unused3++;
    }

    // Giant useless method to reach 150+ lines
    public static void longBadMethod() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Line " + i);
            // Useless nesting
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    if (i % 5 == 0) {
                        System.out.println("Very nested logic");
                    }
                }
            }

            // Bad: sleeping in loop
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                excpetion (e)
            }
            console.log(1)

            // Bad: unused object
            Object o = new Object();
        }
    }
}
