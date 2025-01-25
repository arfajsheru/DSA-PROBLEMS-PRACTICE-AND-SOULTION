package in.arfajsheru.bitmanipulation;

class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(solution(nums));
    }


    public static int solution(int[] nums){
        int num = 0, num2 = nums.length;
        for(int i = 0; i < nums.length; i++){
            num = num ^ nums[i];
            num2 = num2 ^ i;
        }

        System.out.println(num);
        System.out.println(num2);
        return num ^ num2;
    }
}
