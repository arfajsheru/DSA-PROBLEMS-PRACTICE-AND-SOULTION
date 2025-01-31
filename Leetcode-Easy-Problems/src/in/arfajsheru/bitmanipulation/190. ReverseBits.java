package in.arfajsheru.bitmanipulation;

class ReverseBits {
    public static void main(String[] args) {
        System.out.println(solution(0b11110000111100001111000011110000));
    }

    public static String solution(int num) {
        long result = 0; // Use long to store result
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (num & 1); // Append the last bit of num to result
            num = num >>> 1; // Perform unsigned right shift on num
        }
        return Long.toBinaryString(result);
    }
}

// result ko left shift move karo and right shift me zero fill karo
// (num & 1) ye opertaion perform karge num se last bit ko uthayega or result ki end pe add
// result me add hone ke baad number ko thodana padega to number me right shit use karenge or number ko right shift move
// karenge or left side me zero add karenge
