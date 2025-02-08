package in.arfajsheru.math;
import java.util.Arrays;

class PlusOne {
    public static int[] Solution(int[] digits){ // 1, 3. 9
        for(int i = digits.length - 1; i >= 0; i--){
            //0 = 3 - 1 = 2 (2 >= 0) true // 1 = 3 - 2 = 1 ( 1 >= 0) true
            if(digits[i] != 9){  //9 != 9 false 3 != 9
                digits[i]++; // 3 = 3 + 1 = 4
                return digits; // 140
            } else{
                digits[i] = 0; // 9 = 0
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static int[] solution(int[] digits){
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        int[] newdigit = Solution(new int[] {9,9,9});
        System.out.println(Arrays.toString(newdigit));
    }
}
