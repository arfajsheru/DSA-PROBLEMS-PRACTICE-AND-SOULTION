package in.arfajsheru.bitmanipulation;

class NumberComplement {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int num){
        int bitlength = Integer.toBinaryString(num).length(); // 4

        int mask = (1 << bitlength) - 1; //( 0001 << 4 ) = 0000 -1 = 1111 = 15
        System.out.println("mask = " + Integer.toBinaryString(mask));
        System.out.println("num = " + Integer.toBinaryString(num));

        int result = num ^ mask;
        System.out.println("result = " + Integer.toBinaryString(result));

        return result;
    }
}
