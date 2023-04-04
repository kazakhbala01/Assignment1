import java.util.Scanner;
public class EX1 {
    public void sol(){
        System.out.println("Write number of elements and elements\n For example 5\n 1 2 4 5 6");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr= new int[a];
        for (int x=0;x<a;x++){
            arr[x]=sc.nextInt();
        }
        System.out.println(FindMin(arr,a));
        }

    public static int FindMin(int[] arr,int n){
        int min;
        if(n==1){
            return arr[0];
        }
        else{
            min=FindMin(arr,n-1);
        }
        return Math.min(arr[n-1],min);
    }
}
