package in.arfajsheru.bitmanipulation;

class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }


    public static int solution(int num){
        int count = 0;
        while(num > 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}
