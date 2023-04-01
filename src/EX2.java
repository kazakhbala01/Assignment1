import java.util.Scanner;
public class EX2 {
    public void sol() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int n = 0;
        for (int x = 0; x < a; x++) {
            arr[x] = sc.nextInt();
            n = arr[x] + n;
        }
        System.out.println(n/a);
    }
}
