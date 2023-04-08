/**
 * The PowerOfNumber method is a recursive function that calculates the power of a given number.
 * @param a the base number.
 * @param n the exponent number.
 * @return the result of a raised to the power of n.
 */

import java.util.Scanner;

public class EX6 {

    public void sol(){
        System.out.println("Power of number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(PowerOfNumber(a,n));
    }

    public static int PowerOfNumber(int a,int n){
        // If n equals one, return a.
        if(n==1){
            return a;
        }else{
            // Else, return integer a multiplied by the recursive function PowerOfNumber(a, n-1).
            return PowerOfNumber(a,n-1)*a;
        }
    }
}