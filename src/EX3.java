import java.util.Scanner;
public class EX3 {
    public void sol() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Composite");
            }
            else{
                System.out.println("Prime");
            }
    }
}}
