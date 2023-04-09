/*
 * This function checks whether the given number is prime or not.
 * The inputs are an integer n to be checked for primacy, and an integer a which starts at n-1 and is recursively
 * decreased until it reaches 1, to check whether n is divisible by any number other than 1 and itself.
 * The function returns True if n is prime and False otherwise.
 * @param n is given number to check prime or not
 * @return true or false
 */

import java.util.Scanner;

public class EX3 {
    public static void sol() {
        System.out.println("Prime or Composite:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (checkPrimeNumber(n,n-1)) {
            System.out.println("Prime"); // if the checkPrimeNumber function returns True, output "Prime"
        }
        else{
            System.out.println("Composite"); // if the checkPrimeNumber function returns False, output "Composite"
        }
    }


    public static boolean checkPrimeNumber(int n, int a){
        if(a==1){
            return true; // If integer a equals 1 it means that number doesn't divide other numbers except itself and 1 and returns True
        }else if(n%a==0){
            return false; // If given number divides to a any number except 1 returns False
        }
        return checkPrimeNumber(n,a-1); //calls checkPrimeNumber again with a decreased by one
    }
}
