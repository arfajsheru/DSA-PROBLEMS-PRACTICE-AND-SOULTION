package in.arfajsheru.math;

class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(solution("ABF"));
        System.out.println(solution2("ABFAF"));

    }

    public static int solution(String columnTitle){
        int result = 0;
        for(int i = 0; i < columnTitle.length(); i++){
            char ch = columnTitle.charAt(i);
            int currVal = ch - 'A' + 1; // 1 - 1 + 1 = 1, 2 - 1 + 1 = 2
            result = result * 26 + currVal; // 0 *= 26 + 1 = 1, 1 *= 26 + 2;
        }
        return result;
    }
    public static int solution2(String columnTitle){
        int result = 0, pow = 0;
        for(int i = columnTitle.length() - 1; i >= 0; i--, pow++){
            char ch = columnTitle.charAt(i);
            int currVal = ch - 'A' + 1;
            result += currVal * (int) Math.pow(26,pow);
        }
        return result;
    }

}
