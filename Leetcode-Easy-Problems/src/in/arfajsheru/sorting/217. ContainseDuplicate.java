package in.arfajsheru.sorting;

class ContainseDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,3};
        System.out.println(solution(nums));
    }

    public static boolean solution(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
