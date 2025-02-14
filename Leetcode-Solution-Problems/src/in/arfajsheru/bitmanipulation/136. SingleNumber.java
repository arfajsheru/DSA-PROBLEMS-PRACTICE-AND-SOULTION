package in.arfajsheru.bitmanipulation;

class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,1,4,2};
        System.out.println(solution(nums));

    }
    public static int solution(int[] nums){
        int num = 0;//1, 1, 0
        for(int i = 0; i < nums.length; i++){
            num = num ^ nums[i];
            System.out.println("num= " + i + " nums[i]= " + nums[i]);
            System.out.println("xor num = " + num);
        }
        return num;
    }
}




