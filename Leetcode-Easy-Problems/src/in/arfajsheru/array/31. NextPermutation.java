
package in.arfajsheru.array;

import java.util.Arrays;

class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {7,2,5,3,2,1,0};
        solution(nums);

        System.out.println(Arrays.toString(nums));
    }


    public static void solution(int[] nums){
        int i = nums.length - 2; // i hamar right se seconde elements se chalega
        while(i >= 0 && nums[i] >= nums[i + 1]) { // jab talak nums[i] >= nums[i + 1] se bada he tab talak i-- karte raho or jab koi bada number mil jaaye to break kardo thik he
            i--; // if nums[i] se bad number mil jaayega to loop break ho jaayega
        }
        if(i >= 0){ // abhi break point mil gaya to uski right side se bada number dhudho j ko declare karke
            int j = nums.length - 1;
            while(nums[i] >= nums[j]){ // i ki value decreasing order me i se choti he to
                // j-- karo
                j--; // i ki value se bada number milega to loop break ho jaayega or swap karega vo 2 elements ko
            }
            swap(nums, i , j);
        }
        reverse(nums, i + 1 , nums.length - 1);
    }
    public static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static  void reverse(int[] nums, int i , int j){
        System.out.println("i = " + i + " j = " + j);
        while(i < j){
            System.out.println(i + " < " + j);
            swap(nums, i , j);
            i++;
            j--;
        }
    }
}



