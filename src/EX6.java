import java.util.Scanner;
public class EX6 {
    public void sol(){
        System.out.println("Power of number:");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int n=sc.nextInt();
    System.out.println(PowerOfNumber(a,n));
    }
    public static int PowerOfNumber(int a,int n){
        if(n==1){
            return a;
        }else{
            return PowerOfNumber(a,n-1)*a;
        }
    }
}
