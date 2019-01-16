package java_if_else;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * The type Solution.
 */
public class Solution {



    private static String weirdPrint(int n){
        String weirdValue = "";

        if (n <= 100 && n >= 1){
            if (n % 2 == 0){
                if (n < 6){
                    weirdValue = "Not Weird";
                }
                else if (n <= 20){
                    weirdValue = "Weird";
                }
                else if (n > 20){
                    weirdValue = "Not Weird";
                }
            }
            else{
                weirdValue = "Weird";
            }
        }

        return weirdValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(weirdPrint(N));
        scanner.close();
    }
}

