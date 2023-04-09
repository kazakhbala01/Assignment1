# Project Assignment1

This is java project of Almas Amanbay from SE-2215 with 10 exercises that should be done with recursive functions. EX(number) is exercise numbers, for example EX1 means exercise 1.

## Exercise 1

In this problem 1:

You are given a number “n” and an array of “n” elements, 
write the function that returns minimum of them.

5

10 1 32 3 45     |       1

First I ask user to input number of elements of Array, and then elements of an Array. Then FindMin function will call itself again and again with (n) decreased by one utill (n) equals to 1, then compares 2 numbers and return minimum number of Array.

## Solution

```java
public static int FindMin(int[] arr,int n){//solution was made by recursion method
        int min;
        if(n==1){
            return arr[0];//If n equals to 1, returns last element of array, recursion ends
        }
        else{
            min=FindMin(arr,n-1);//recurse next function with n-1
        }
        return Math.min(arr[n-1],min);//Compare 2 numbers and returns minimum of them
    }
}
```

## Exercise 2

In this problem 2: 

You are given a number “n” and an array of “n” elements, 
write the function that returns average of them.

4

3 2 4 1     |     2.5

First I ask user to input number of elements of Array, and then elements of an Array. Then sumOfArray function will call itself again and again by summing every array element (n) decreased by one utill (n) equals to 1, then returns sum of array. Then findAverageOfArray function gets sum of array and divides it to number of elements (n) and outputs average of array.

## Solution

```java

/**
 * The findAverageOfArray method takes an array of integers and its length as input,
 * and returns the average of the array as a double value.
 * @param arr the array of integers to find the average of.
 * @param n the length of the input array.
 * @return the average of the input array.
 */

    public static double findAverageOfArray(int[] arr,int n){
        //return sumOfArray divided by number of elements
        return sumOfArray(arr,n)/n;
    }

    public static double sumOfArray(int[] arr,int n){
        double averg;
        if(n==1){
            //if n equals to one return first array, then recursion ends
            return arr[0];
        }
        else{
            //calls recursive function again with n decreased by one
            averg=sumOfArray(arr,n-1);
        }return averg+arr[n-1];
    }
}

```

## Exercise 3

In this problem 3: 

You are given a number “n”, write the function for checking 
whether“n” is prime.

5   |   prime

9   |   composite

First I ask user to input number that need to be checked. Then checkPrimeNumber function will return true or false by dividing given number to every lower number except 1, then if given number divides only to one returns true, else returns false.

## Solution

```java

/*
 * This function checks whether the given number is prime or not.
 * The inputs are an integer n to be checked for primacy, and an integer a which starts at n-1 and is recursively
 * decreased until it reaches 1, to check whether n is divisible by any number other than 1 and itself.
 * The function returns True if n is prime and False otherwise.
 * @param n is given number to check prime or not
 */
import java.util.Scanner;

    public static boolean checkPrimeNumber(int n, int a){
        if(a==1){
            return true; // If integer a equals 1 it means that number doesn't divide other numbers except itself and 1 and returns True
        }else if(n%a==0){
            return false; // If given number divides to a any number except 1 returns False
        }
        return checkPrimeNumber(n,a-1); //calls checkPrimeNumber again with a decreased by one
    }
}

```

## Exercise 4

In this problem 4:

You are given a number “n”, write the program using recursion for
finding “n!”

5 | 120

6  | 720


First I ask user to input number. Then FindFactorial function will call itself again and again by multiplying every number starting from one until number will equal to input number. Then function returns result of multiplication. 

## Solution

```java

/**
 * The FindFactorial method is a recursive function that calculates the factorial of an integer.
 * @param n the integer value to find the factorial of.
 * @return the factorial of the input integer.
 */

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

```
