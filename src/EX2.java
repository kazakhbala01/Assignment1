import java.util.Scanner;
public class EX2 {
    public void sol() {
        System.out.println("Average:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int n = 0;
        for (int x = 0; x < a; x++) {
            arr[x] = sc.nextInt();
            n = arr[x] + n;
        }
        System.out.println(findAverageArray(arr,a));
    }

    public static double findAverageArray(int[] arr,int n){
        return sumOfArray(arr,n)/n;
    }

    public static double sumOfArray(int[] arr,int n){
        double averg;
        if(n==1){
            return arr[0];
        }
        else{
            averg=sumOfArray(arr,n-1);
        }return averg+arr[n-1];
    }
}
