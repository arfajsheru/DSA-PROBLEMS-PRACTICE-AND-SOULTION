package in.arfajsheru.binarysearch;

class SearchInRotadedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2,};
        System.out.println(solution(nums, 0));
    }

    public static int solution(int[] nums, int target){
        int beg = 0, end = nums.length - 1;
        // beg = 0, 4      end = 2
        while(beg <= end){
            int mid = beg + (end - beg) / 2;
            System.out.println(mid);
            // mid = 3 , 4

            if(target == nums[mid]) { // 0 == 7F
                return mid;
            }

            //{4,5,6,7,0,1,2}
            //which part is sorted
            if(nums[beg] <= nums[mid]){ // 4 <= 7
                if(nums[beg] <= target && target <= nums[mid]){ //4 <= 0 && 0 <= 7
                    end = mid - 1;
                } else{
                    beg = mid + 1; // 3 + 1 = 4
                }
            } else {
                if(nums[mid] <= target && target <= nums[end]){
                    beg = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
