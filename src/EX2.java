/**
 * The findAverageOfArray method takes an array of integers and its length as input,
 * and returns the average of the array as a double value.
 * @param arr the array of integers to find the average of.
 * @param n the length of the input array.
 * @return the average of the input array.
 */

import java.util.Scanner;

public class EX2 {

    public void sol() {
        System.out.println("Average:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int x = 0; x < a; x++) {
            arr[x] = sc.nextInt();
        }
        System.out.println(findAverageOfArray(arr,a));
    }


    public static double findAverageOfArray(int[] arr,int n){
        return sumOfArray(arr,n)/n;
    }

    public static double sumOfArray(int[] arr,int n){
        double averg;
        if(n==1){
            return arr[0];
        }
        else{
            averg=sumOfArray(arr,n-1);
        }return averg+arr[n-1];
    }
}
