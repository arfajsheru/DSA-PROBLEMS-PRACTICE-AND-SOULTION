package in.arfajsheru.bitmanipulation;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(solution(0,15));
    }

    public static int solution(int x, int y){
        int xor = x ^ y;
        int count = 0;
        while (xor > 0){
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
}
