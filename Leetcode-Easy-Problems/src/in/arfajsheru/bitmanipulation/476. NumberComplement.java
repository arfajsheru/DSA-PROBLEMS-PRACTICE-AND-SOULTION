package in.arfajsheru.bitmanipulation;

class NumberComplement {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int num){
        int bitlength = Integer.toBinaryString(num).length(); // 4

        int mask = (1 << bitlength) - 1; //( 1 << 3 (1000) ) = 8 - 1 = 111 = 7
        System.out.println("mask in binary = " + Integer.toBinaryString(mask));
        System.out.println("num in binary = " + Integer.toBinaryString(num));

        int result = num ^ mask; // 5 ^ 15 = 101
                                           //111
                                           //010
        System.out.println("result in binary= " + Integer.toBinaryString(result));

        return result;
    }
}
