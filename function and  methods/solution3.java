// check number is palindrome or not 
// palindrome is called if the number is equal to the reverse number for eg 121 reverse is also 121
import java.util.*;
public class solution3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number : ");
        int palindrome = sc.nextInt();
        

        if(isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }
    }

    public static boolean isPalindrome (int number) {
        int palindrome = number ; 
        int reverse = 0;

        while (palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }
}
