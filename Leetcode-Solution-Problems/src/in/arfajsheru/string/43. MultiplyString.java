package in.arfajsheru.string;

class MultiplyString {
    public static void main(String[] args) {
        System.out.println(solution("123","456"));
    }


    public static String solution(String num1, String num2){
        if("0".equals(num1) || "0".equals(num2)){
            return "0";
        }

        int m = num1.length(), n = num2.length();
        int[] arr = new int[m + n];

        for(int i = m - 1; i >= 0; --i){
            int a = num1.charAt(i) - '0';
            for(int j = n - 1;  j >= 0; --j){
                int b = num2.charAt(j) - '0';
                arr[i + j + 1] += a * b;
            }
        }

        for(int i = arr.length - 1; i > 0; --i){
            arr[i - 1] += arr[i] / 10; // carry niklega ga idhar se
            arr[i] %= 10; // or idhar reminder
        }

        int i = arr[0] == 0 ? 1 : 0; // if agar arr[0] he to usko first index se add karna start karo if agar nahi he to zero se start karo
        StringBuilder ans = new StringBuilder();
        for(; i < arr.length; ++i){
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}
