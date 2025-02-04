package in.arfajsheru.array;

class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};  // Example Input
        System.out.println(solution(nums));  // Output should be 4, the 3rd max number.
    }

    public static int solution(int[] nums) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num == first || num == second || num == third) {
                continue;  // Duplicate values ko skip karenge
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                third = second;
                second = num;
            } else if (num > third) {
                third = num;
            }
        }

        // Agar third max nahi mila, toh largest return karo
        return third == Integer.MIN_VALUE ? first : third;
    }
}
