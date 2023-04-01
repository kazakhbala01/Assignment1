import java.util.Scanner;
public class EX5 {
    public void sol(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=1;
        int res=0;
        for(int i=0;i<n;i++){
            res=n1+n2;
            n2=n1;
            n1=res;
        }
        System.out.println(res);
    }
    }
