import java.util.Scanner;
public class EX1 {
    public void sol(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr= new int[a];
        for (int x=0;x<a;x++){
            arr[x]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<a;i++){
            if (arr[i]<=min) {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
