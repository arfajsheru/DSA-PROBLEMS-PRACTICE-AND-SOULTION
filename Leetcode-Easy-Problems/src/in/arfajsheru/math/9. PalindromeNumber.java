package in.arfajsheru.math;

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
        int rev = 0; //1 ,14, 143, 1434, 14341
        int original = number; //14341
        while(number != 0){ // 14341 != 0, 1434 != 0, 143 != 0 , 14 != 0, 1 != 0, 0 != 0 True
            rev = rev * 10 + number % 10;
            // 0 += 10 + 1 = 1, 1 = 1 * 10 + 4 = 14 , 14 = 14 * 10 + 3 = 143, 143 = 143 * 10 + 4 = 1434, 1434 = 1434 * 10 + 1 = 14341
            number /= 10; //14341 / 10 = 1434, 1432 / 10 = 143 , 143 / 10 = 14, 14 / 10 = 1, 1 / 10 = 0
        }
        return rev == original; // 14341 = 14341 = ture
    }

    public static void main(String[] args) {
        if(isPalindrome(14341)){
            System.out.print("Your number is palindrome number");
        } else{
            System.out.print("Your number is not palindrome number");
        }
    }
}
