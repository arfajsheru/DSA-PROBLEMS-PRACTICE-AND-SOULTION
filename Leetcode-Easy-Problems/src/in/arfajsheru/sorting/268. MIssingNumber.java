package in.arfajsheru.sorting;

import java.util.Arrays;

class MIssingNumber {
    public static void main(String[] args) {
        int [] nums = {1};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length; i++){
            System.out.println("i=" + i + "numi = " + nums[i]);
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
