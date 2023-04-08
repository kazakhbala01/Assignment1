import java.util.Scanner;
public class EX3 {
    public void sol() {
        System.out.println("Prime or Composite:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
            if (checkPrimeNumber(n,n-1)) {
                System.out.println("Prime");
            }
            else{
                System.out.println("Composite");
            }
    }
    public static boolean checkPrimeNumber(int n, int a){
        if(a==1){
            return true;
        }else if(n%a==0){
            return false;
        }
        return checkPrimeNumber(n,a-1);
    }
}
