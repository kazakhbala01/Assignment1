/**
 * Find the minimum number of given array
 * @param arr is an integer array
 * @param n is the number of elements in the array
 * @return the minimum number in the array
 */

import java.util.Scanner;

public class EX1 {

    public static int FindMin(int[] arr,int n) {
        int min;
        if (n == 1) {
            return arr[0]; //If n equals to 1, returns last element of array, recursion ends
        }
        else {
            min = FindMin(arr, n-1); //recurse next function with n-1
        }
        return Math.min(arr[n-1], min); //Compare both numbers and returns minimum of them
    }

    public static void sol(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt(); //number of elements in array
        int[] arr = new int[n]; //creating integer array
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //input elements into array
        }
        System.out.println("The minimum number in the array is " + FindMin(arr, n)); //Print output of the function FindMin
    }
}
