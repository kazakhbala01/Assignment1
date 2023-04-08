import java.util.Scanner;
public class EX5 {
    public void sol(){
        System.out.println("Fibonacci sequence:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(FindFibonacciNumber(n));
    }
    public static int FindFibonacciNumber(int n){
        if(n==1||n==0){
            return n;
        }else{
            return FindFibonacciNumber(n-1)+FindFibonacciNumber(n-2);
        }
    }
    }
