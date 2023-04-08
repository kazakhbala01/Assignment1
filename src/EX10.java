/**
 * Recursively calculates the GCD of two numbers using the Euclidean algorithm.
 * @param a the first number
 * @param n the second number
 * @return the GCD of a and n
 */

import java.util.Scanner;

public class EX10 {

    public static void sol() {
        System.out.println("GCD:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // first number
        int n=sc.nextInt(); // second number
        System.out.println(findGcdOfNumber(a,n)); // prints the GCD
    }

    public static int findGcdOfNumber(int a, int n){
        if(n==0){
            return a;
        } else if(a==1){
            return 1;
        } else {
            return findGcdOfNumber(n, a % n);
        }
    }
}
