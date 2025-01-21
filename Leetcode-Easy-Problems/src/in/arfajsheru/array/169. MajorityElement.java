package in.arfajsheru.array;

class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,1,2};
        System.out.println(Solution(nums));
    }

    public static int Solution(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }

            }
            if(count > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    }
}
