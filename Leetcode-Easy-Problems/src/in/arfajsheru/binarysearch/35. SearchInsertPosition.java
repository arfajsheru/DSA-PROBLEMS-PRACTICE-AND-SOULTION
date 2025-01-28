package in.arfajsheru.binarysearch;
/*
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*
* */
class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(Solution(arr,2));
    }

    public static int Solution(int[] arr, int target){
        int beg = 0; // 2
        int end = arr.length - 1; // 4 - 1 = 3

        while(beg <= end){ // 0 < 3 t, 4 < 3
            int mid = beg + (end - beg) / 2; // 3 / 2 = 1
            if(arr[mid] == target){ // 3 == 7 false // 6 == 7  false
                return mid;
            } else if(target < arr[mid]){ // 7 < 3 false, // 7 < 6
                end = mid - 1;
            } else {
                beg = mid + 1; // 0 = 1 + 1 = 2, 2 = 3 + 1 = 4,
            }
        }
        return beg;
    }
}
