/**
 * The FindFibonacciNumber method is a recursive function that calculates the nth number in the Fibonacci sequence.
 * @param n the index of the Fibonacci number to be calculated.
 * @return the nth Fibonacci number.
 */

import java.util.Scanner;

public class EX5 {


    public static void sol(){
        System.out.println("Fibonacci sequence:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(FindFibonacciNumber(n));
    }

    public static int FindFibonacciNumber(int n){
        // If n equals 0 or 1, return n.
        if(n==1||n==0){
            return n;
        }else{
            // Else, return the sum of the recursive function FindFibonacciNumber(n-1) 
            // and the recursive function FindFibonacciNumber(n-2).
            return FindFibonacciNumber(n-1)+FindFibonacciNumber(n-2);
        }
    }
}