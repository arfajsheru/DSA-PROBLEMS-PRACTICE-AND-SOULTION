package in.arfajsheru.array;
import java.util.Scanner;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1];

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */
class TwoSum {
    public int[] twoSum(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){ // condition check
                    return new int[] {i, j}; // return target array of target sum
                }
            }
        }
        throw new IllegalArgumentException("INVALID INPUT");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoSum twosum = new TwoSum();
        System.out.print("Please enter your target number: ");
        int target = sc.nextInt();
        int[] arr = {0,0,1,1,2,2,3,3,4,4};
        int[] result = twosum.twoSum(arr, target);
        System.out.println("Indices: [" + result[0]+ ", "+ result[1]+ "]");
    }
}

/*
 * 2 arguments he ak int array or ak int
 * pehle i vala loop ak index lega or ander j vala loop iterate karga or i or j index vali value ka addition karenge
 * if addition == target he to vo i or j ki index vali value ko return karlo
 *  */