package in.arfajsheru.bitmanipulation;

class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,8,0,1,};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums){
      int num1 = 0, num2 = nums.length;

      for(int i = 0; i < nums.length; i++){
          num1 = num1 ^ nums[i];
          num2 = num2 ^ i;
      }
      return num1 ^ num2;
    }
}
