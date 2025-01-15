package in.arfajsheru.math;
import java.util.Arrays;

class PlusOne {
    public static int[] Solution(int[] digits){
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            } else{
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] newdigit = Solution(new int[] {1,0});
        System.out.println(Arrays.toString(newdigit));
    }
}
