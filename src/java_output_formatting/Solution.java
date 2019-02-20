package java_output_formatting;

import java.util.Scanner;

/**
 * The type Solution.
 */
public class Solution {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String string = scanner.next();
            int x = scanner.nextInt();

            System.out.printf("%-15s%03d%n", string, x);
        }
        System.out.println("================================");

    }
}



