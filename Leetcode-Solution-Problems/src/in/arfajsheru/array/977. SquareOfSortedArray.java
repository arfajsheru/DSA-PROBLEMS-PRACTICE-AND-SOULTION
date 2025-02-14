package in.arfajsheru.array;

import java.util.Arrays;

class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(solution(nums)));
    }

    public static int[] solution(int[] nums) {


        int[] result = new int[nums.length];
        int beg = 0, end = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            int sqr1 = (int) Math.pow(nums[beg], 2);
            int sqr2 = (int) Math.pow(nums[end], 2);

            if (sqr1 >= sqr2) {
                result[nums.length - 1 - i] = sqr1;
                beg++;
            } else {
                result[nums.length - 1 - i] = sqr2;
                end--;
            }
        }
        return result;
    }
}
