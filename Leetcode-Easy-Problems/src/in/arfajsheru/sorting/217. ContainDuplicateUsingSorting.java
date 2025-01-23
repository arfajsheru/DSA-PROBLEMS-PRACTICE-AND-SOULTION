package in.arfajsheru.sorting;

import java.util.Arrays;

class ContainseDuplicateUsingSorting {
    public static void main(String[] args) {
        int[] nums = {3,3};
        System.out.println(solution(nums));
    }

    public static boolean solution(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}
