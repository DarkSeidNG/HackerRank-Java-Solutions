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
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.printf("%-15s%03d%n", s1, x);

            //Complete this line
        }
        System.out.println("================================");

    }
}



