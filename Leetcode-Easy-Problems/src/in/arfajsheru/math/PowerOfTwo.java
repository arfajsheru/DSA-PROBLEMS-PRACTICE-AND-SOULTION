package in.arfajsheru.math;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(solution(48));
    }

    public  static  boolean solution(int num){
        if(num <= 0) return false;

        while (num % 2 == 0) { // 48 % 2 = 0T, 24 % 2 = 0T, 12 % 2 = 0T, 6 % 2 = 0T, 3 % 2 = 0F,
            System.out.println("num" +  num + " % " + " 2 ");
            num /= 2;
            System.out.println(num);
        }

        return num == 1; // 3 == 1F
    }
}
