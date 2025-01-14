package in.arfajsheru.dsasolution.Math;

import java.util.Scanner;

class ReverseInteger {
    public static int reversNumber(int number){
        int rev = 0;
        while(number != 0){
            int digit = number % 10;
            if(rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && digit > 7){
                return 0;
            }
            if(rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE / 10 && digit < -8){
                return 0;
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
