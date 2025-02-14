package in.arfajsheru.other;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(solution(123456789));
    }
    public static int solution(int num){
        int sum1 = 0; int sum2 = 0;
        while(num != 0){
            sum1 = sum1 + (num % 10);
            num /= 10;
        }
        while(sum1 != 0){
            sum2 = sum2 + (sum1 % 10);
            sum1 /= 10;
        }
        return sum2;
    }

//    public static int solution(int num){
//        if (num == 0) return 0; // Handle the edge case
//        return 1 + (num - 1) % 9;
//    }
}
