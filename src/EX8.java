/**
 * This method checks if the given string contains only digits.
 * @param s the string to be checked
 * @return true if the string contains only digits, false otherwise
 */

import java.util.Scanner;

public class EX8 {
    public static void sol() {
        System.out.println("check for digits:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();//number of elements
        if (CheckDigit(a)) {
            System.out.println("YES"); // if the CheckDigit function returns True, output "YES"
        }
        else{
            System.out.println("NO"); // if the CheckDigit function returns False, output "NO"
        }
        //print output of CheckDigit method
    }

    public static boolean CheckDigit(String s) {
            if (s.length() == 0) {
                //an empty string is considered to have only digits
                return true;
            } else if (!Character.isDigit(s.charAt(0))) {
                // if the first character is not a digit, return false
                return false;
            } else {
                // else, recursively call the function with the substring starting from the second character
                return CheckDigit(s.substring(1));
            }
        }
}
