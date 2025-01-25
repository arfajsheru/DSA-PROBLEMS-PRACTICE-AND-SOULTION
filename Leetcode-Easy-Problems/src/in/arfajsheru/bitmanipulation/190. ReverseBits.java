package in.arfajsheru.bitmanipulation;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(solution(0b1010010101011010110));
    }

    public static long solution(int num){
        int result = 0;
        for(int i = 0; i < 32; i++){
            result = result << 1;
            result = result | (num & 1);
            num = num >>> 1;
        }
        return result & 0xFFFFFFFFL;
    }
}
