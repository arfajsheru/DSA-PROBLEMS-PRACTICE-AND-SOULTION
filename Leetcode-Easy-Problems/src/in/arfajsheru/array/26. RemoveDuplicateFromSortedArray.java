package in.arfajsheru.array;
/*
* Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
* */
class RemoveDuplicateFromSortedArray {
    //    int[] arr = {0,0,1,1,1,2,2,3,3,4};
    public static int removeDuplicateArray(int[] arr){
        if(arr.length == 0) return 0;
        int prev = 0; //prev = 0 , prev++ = 1 prev++ = 2 prev = 4
        for(int i = 1; i < arr.length; i++){ // i1 = 0, i2 = 1, i3 = 1, i4 = 1, i5 = 2, i6 = 2, i7 = 3 i8 = 3, i9 = 4
            if(arr[prev] != arr[i]){ // 0 != 0 = false, 0 != 1 = ture, 1 != 1 false, 1 != 2 true 2 != 2 false 2 != 3 true, 3 != 3 false, 3 != 4 true
                arr[++prev] = arr[i];// prev = 1 prev = 2 prev = 3 prev = 4
                //{0,1,1,1,2,2,3,3,4}
                //{0,1,2,2,3,3,4}
                //{0,1,2,3,4}
                //{0,1,2,3,4}

            }
        }
        return prev + 1; // 4 + 1 = 5
    }
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicateArray(arr);
        System.out.println("result is : " + result);
    }
}
