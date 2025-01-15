package in.arfajsheru.dsasolution.Math;

import java.util.Scanner;
/*
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

* */
class PalindromeNumber {
    public static boolean isPalindrome(int number){
        int rev = 0;
        int original = number;
        while(number != 0){
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        System.out.println(rev);
        return rev == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int number = sc.nextInt();
        if(isPalindrome(number)){
            System.out.printf("Your number %d is palindrome number", number);
        } else{
            System.out.printf("Your number %d is not palindrome number", number);
        }
    }
}
