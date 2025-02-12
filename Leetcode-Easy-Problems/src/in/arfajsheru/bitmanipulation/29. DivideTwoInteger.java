package in.arfajsheru.bitmanipulation;

class DivideTwoInteger {
    public static void main(String[] args) {
        System.out.println(solution(10,3));
    }

    public static  int solution(int divident, int divisor) {
        if(divident == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        int sign = ((divident < 0) ^ (divisor < 0)) ? -1 : 1;

        // Convert long and absolute value.
        long num = Math.abs((long) divident);
        long deno = Math.abs((long) divisor);
        int quotient = 0;

        // num = 10, 4 deno = 3
        // quotient = 0,2, temp = 3,6
        // mulitple = 1,2

        while(num >= deno){ // 10 >= 3T, 4 >= 3,
            long temp = deno; // temp = 3,6 , temp = 3
            int multiple = 1; // multiple = 1,2 , multiple = 1,
            while(num >= (temp << 1)){ // 10 >= 6T, 10 >= 12F, seconde 4 >= 6F
                temp <<= 1; // temp = 6,
                multiple <<= 1; // 2
            }
            num -= temp; // 10 - 6 = 4, 4 - 3 = 1
            quotient += multiple; // 0 + 2 = 2, 2 + 1 = 3
        }

        return (sign * quotient);  // (sign * 3)
        }
}
