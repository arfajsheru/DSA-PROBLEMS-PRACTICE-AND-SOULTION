package in.arfajsheru.binarysearch;

class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Solution(arr,8, 0, arr.length - 1));
    }

    public static int Solution(int[] arr, int target, int low,int high){
        if(low > high){
            return -1;
        }
        int mid = low + (high - low) / 2;
        if(arr[mid] == target){
            return mid;
        } else if(target < arr[mid]){
            return Solution(arr, target, low, mid - 1);
        } else {
            return Solution(arr, target, mid + 1, high);
        }
    }
}
