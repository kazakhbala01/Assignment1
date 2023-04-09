# Project Assignment1

This is java project of **Almas Amanbay** from **SE-2215** with 10 exercises that should be done with recursive functions. EX(number) is exercise numbers, for example EX1 means exercise 1.

# Exercise 1

In this problem 1:

You are given a number “n” and an array of “n” elements, 
write the function that returns minimum of them.


`input: 5`

`input: 10 1 32 3 45`  | `output:1`

## Explanation

Ask user to input number of elements of Array, and then elements of an Array. Then FindMin function will call itself again and again with (n) decreased by one utill (n) equals to 1, then compares 2 numbers and return minimum number of Array.

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

# Exercise 2

In this problem 2: 

You are given a number “n” and an array of “n” elements, 
write the function that returns average of them.

`input: 4`

`input: 3 2 4 1`     |    `output: 2.5`

## Explanation

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

# Exercise 3

In this problem 3: 

You are given a number “n”, write the function for checking 
whether“n” is prime.

`input: 5`   |   `ouput: prime`

`input: 9`   |   `output: composite`

## Explanation

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

# Exercise 4

In this problem 4:

You are given a number “n”, write the program using recursion for
finding “n!”

`5` | `120`

`6`  | `720`


## Explanation

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

# Exercise 5

In this problem 5:

You are given a number “n”, write the function for finding n-th
elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2). 
F0= 0, F1 = 1

`5` | `5`

`17` | `1597`

## Explanation

First I ask user to input number to show nth element of fibonacci sequence. Then FindFibonacciNumber function will call 2 another FindFibonacciNumber function again and again with (n) decreased by one and then by two, then returns sum of recursive functions.

## Solution

```java
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
```
# Exercise 6

In this problem 6:

You are given numbers “a” and “n”, write the function that 
returns “a power n
”.

`2 5` | `32`

`3 3` | `27`

## Explanation

First I ask user to input base number and exponent number. Then PowerOfNumber function will call itself again and again until n will equal to one, then returns result of multiplication.

## Solution

```java
public static int PowerOfNumber(int a,int n){
        // If n equals one, return a.
        if(n==1){
            return a;
        }else{
            // Else, return integer a multiplied by the recursive function PowerOfNumber(a, n-1).
            return PowerOfNumber(a,n-1)*a;
        }
    }
```

# Exercise 7

In this problem 7:

You are given a number “n” and an array of “n” elements, 
write the program that returns given array in reverse order 
without using array data structure.
(Hint: recursion)

`4`

`1 4 6 2`

`output: 2 6 4 1`

## Explanation

First I ask user to input number of elements and elements of array. Then reverseArr function will call reverseArr method with the next index value. And when index value will be equal to array length recursion stops.

## Solution

```java
 public static void reverseArr(int[] arr, int index){
                // if the index is equal to the length of the array, return from the method
                if (index == arr.length) {
                    return;
                }
                // call the reverseArr method with the next index value
                reverseArr(arr, index + 1);
                System.out.print(arr[index] + " ");
            }
```
# Exercise 8

In this problem 8:

You are given a string “s”, write the function for checking 
whether “s” is all consists of digits

`123456` | `Yes`

`123a345` | `No`

## Explanation

First I ask user to input number to show nth element of fibonacci sequence. Then FindFibonacciNumber function will call 2 another FindFibonacciNumber function again and again with (n) decreased by one and then by two, then returns sum of recursive functions.

## Solution

```java
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
```
# Exercise 9

In this problem 9:

You are given numbers“n” and “k”,write the program that 
finds 
binomial coefficient using formula.

`input: 2 1` | `output: 2`

`input: 7 3 `| `output: 35`

## Explanation

First I ask user to input number k and input number n. Then binomCoef returns 2 recursive function with (n-1,k-1) and (n-1,k). After a lot of recursion it will return concrete number. When k equals 0 or k equals to n function returns 1.

## Solution

```java
public static int binomCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            //else return 2 recursive function with (n-1,k-1) and (n-1,k)
            return binomCoef(n - 1, k - 1) + binomCoef(n-1, k);
        }
    }
```

# Exercise 10

In this problem 10:

You are given “a” and “b”, write the function for finding 
GCD(a, b) using recursion and by using Euclidean Algorithm

`32 48` | `16`

`7 10` | `1`

## Explanation

First I ask user to input number a and input number b. Then findGcdOfNumber returns new method with n and a%n(remainder) parameters and if n equals to zero it returns a(that is GCD) and else if a equals to 1, it means that there greatest common divisor equals to 1.

## Solution

```java
public static int findGcdOfNumber(int a, int n){
        if(n==0){
            return a;
        } else if(a==1){
            return 1;
        } else {
            //else return function with(second number, remainder of first and second number)
            return findGcdOfNumber(n, a % n);
        }
    }
```
