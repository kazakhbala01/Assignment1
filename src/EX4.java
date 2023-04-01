import java.util.Scanner;
public class EX4 {
    public void sol(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>1){
            n=n*(n-1);
        }
        System.out.println(n);
    }

}
