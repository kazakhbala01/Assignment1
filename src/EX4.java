import java.util.Scanner;
public class EX4 {
    public void sol(){
        System.out.println("Factorial:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(FindFactorial(n));
    }
    public static int FindFactorial(int n){
        if(n==1){
            return n;
        }
        else{
           return n*FindFactorial(n-1);
        }
    }
}
