/**
 * The FindFactorial method is a recursive function that calculates the factorial of an integer.
 * @param n the integer value to find the factorial of.
 * @return the factorial of the input integer.
 */

import java.util.Scanner;

public class EX4 {

    public static void sol(){
        System.out.println("Factorial:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(FindFactorial(n));
    }

    public static int FindFactorial(int n){
        // If n equals 1, return 1.
        if(n==1){
            return n;
        }
        else{
            // Else, return n multiplied to the recursive function FindFactorial(n-1).
            return n*FindFactorial(n-1);
        }
    }
}
