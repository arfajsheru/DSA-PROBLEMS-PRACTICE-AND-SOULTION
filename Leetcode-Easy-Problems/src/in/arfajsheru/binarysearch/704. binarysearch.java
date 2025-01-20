package in.arfajsheru.binarysearch;

class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(Solution(arr, 9));
    }

    public static  int Solution(int[] arr, int target){
        int low= 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(target < arr[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
