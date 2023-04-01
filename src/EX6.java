import java.util.Scanner;
public class EX6 {
    public void sol(){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int n=sc.nextInt();
    int res=a;
    for(int i=1;i<n;i++) {
            res=res*a;
    }
    System.out.println(res);
    }
}
