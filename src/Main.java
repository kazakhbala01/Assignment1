import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please write number to solve exercise from 1-10");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        switch (number) {
            case 1 -> EX1.sol();
            case 2 -> EX2.sol();
            case 3 -> EX3.sol();
            case 4 -> EX4.sol();
            case 5 -> EX5.sol();
            case 6 -> EX6.sol();
            case 7 -> EX7.sol();
            case 10 -> EX10.sol();
            case 9 -> EX9.sol();
            }
    }
}