/**
 * The reverseArr method is a recursive function that outputs given array reversed.
 * @param a the number of elements.
 * @param arr the integer array.
 */

import java.util.Scanner;

public class EX7 {
    public static void sol() {
        System.out.println("reverse array:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//number of elements
        int[] arr = new int[a];//integer array
        for (int x = 0; x < a; x++) {
            arr[x] = sc.nextInt();//input elements into array
        }
        reverseArr(arr,0);
        //print output of reverseArray function
    }

    public static void reverseArr(int[] arr, int index){
                // if the index is equal to the length of the array, return from the method
                if (index == arr.length) {
                    return;
                }
                // call the reverseArr method with the next index value
                reverseArr(arr, index + 1);
                System.out.print(arr[index] + " ");
            }
        }
