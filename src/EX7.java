/**
 * The reverseArr method is a recursive function that outputs given array reversed.
 * @param a the number of elements.
 * @param arr the integer array.
 * @return the result of a raised to the power of n.
 */

import java.util.Scanner;

public class EX7 {
    public void sol() {
        System.out.println("reverse array:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//number of elements
        int[] arr = new int[a];//integer array
        for (int x = 0; x < a; x++) {
            arr[x] = sc.nextInt();//input elements into array
        }
        reverseArr(arr,a);
        //print output of reverseArray function
    }
    public void reverseArr(int[] arr,int a){
        if(a==1){
            System.out.print(" ");
        }else{
        reverseArr(arr,a-1);}
        System.out.print(arr[0]);
    }
}
