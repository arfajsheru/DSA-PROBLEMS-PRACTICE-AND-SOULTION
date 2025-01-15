package in.arfajsheru.math;

import java.util.Scanner;

class ReverseInteger {
    public static int reversNumber(int number){
        int rev = 0;
        while(number != 0){
            int digit = number % 10;
            // Overflow check before updating rev
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow for positive numbers
            }
            // Underflow check before updating rev
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow for negative numbers
            }
            rev = rev * 10 + digit;
            number /= 10;
        }
        return  rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = sc.nextInt();
        int result = reversNumber(number);
        System.out.println("Your reverse number is: " + result);
    }
}


// ye program me ye important he ki reverse number karke reverse ka number Integer.MAX_VALUE se bada hoga to overflow ho
// jaayega or agarm Intger.MIN_VALUE se chota hoga to underflow ho jaayega to return 0 kardena