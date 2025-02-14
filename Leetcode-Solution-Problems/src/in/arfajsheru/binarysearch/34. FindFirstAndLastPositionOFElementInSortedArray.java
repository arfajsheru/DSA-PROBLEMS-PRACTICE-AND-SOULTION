package in.arfajsheru.binarysearch;

import java.lang.reflect.Array;
import java.util.Arrays;

class FindFirstAndLastPositionOFElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int[] result  = solution(nums, 8);

        System.out.println(Arrays.toString(result));
    }
    public static int[] solution(int[] nums, int target){
        if(nums.length == 0){
            return new int[] {-1, -1};
        }

        int beg = 0, end = nums.length - 1;
        int[] result = new int[2];
        while(beg <= end){
            int mid = beg + (end - beg) / 2;
            if(nums[mid] < target){
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if(nums[beg] != target){
            return new int[] {-1,-1};
        }
        result[0] = beg;
        end = nums.length;

        while(beg <= end){
            int mid = beg + (end - beg) / 2;

            if(nums[mid] <= target){
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        result[1] = beg - 1;
        return result;
    }
}
