package in.arfajsheru.math;


class ConvertNumberToHexadecimal {
    public static void main(String[] args) {
        System.out.println(solution(26));
    }


    public static String solution(int num){
        char[] hexaNum = new char[] {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();
        while (num > 0){
            int rem = num % 16;
            sb.insert(0,hexaNum[rem]);
            num /= 16;
        }
        return sb.toString();
    }
}
