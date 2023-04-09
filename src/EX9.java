/**
 * This program calculates the binomial coefficient of two given numbers using recursion
 * @param n: the first number
 * @param k: the second number
 * @return the binomial coefficient of n and k
 */

import java.util.Scanner;

public class EX9 {
    public static void sol() {
        System.out.println("Binomial Coefficient");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();//first number(K)
        int n=sc.nextInt();//second number(n)
        System.out.println(binomCoef(k,n));//print output of binomCoef function
    }

    public static int binomCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            //else return 2 recursive function with (n-1,k-1) and (n-1,k)
            return binomCoef(n - 1, k - 1) + binomCoef(n-1, k);
        }
    }
}
