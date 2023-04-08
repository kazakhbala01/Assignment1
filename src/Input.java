import java.util.Scanner;
public class Input {
    EX1 ex1=new EX1();
    EX2 ex2=new EX2();
    EX3 ex3=new EX3();
    EX4 ex4=new EX4();
    EX5 ex5=new EX5();
    EX6 ex6=new EX6();
    EX7 ex7=new EX7();
    EX10 ex10=new EX10();
    EX9 ex9=new EX9();
    //EX8 ex8=new EX8();


    public void vox(){
        System.out.println("Please write number to solve exercise from 1-10");
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
       switch(number){
           case 1:
               ex1.sol();
               break;
           case 2:
               ex2.sol();
               break;
           case 3:
               ex3.sol();
               break;
           case 4:
               ex4.sol();
               break;
           case 5:
               ex5.sol();
               break;
           case 6:
               ex6.sol();
               break;
           case 7:
               ex7.sol();
               break;
           case 10:
               ex10.sol();
               break;
           case 9:
               ex9.sol();
               break;
       }
    }
}
