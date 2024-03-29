// the sum of the digits in an integer
import java.util.*;
public class solution5{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }
    public static int sumDigits(int n) {
        int sumDigits = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sumDigits += lastDigit;
            n /= 10;
        }
        return sumDigits;
    }
}