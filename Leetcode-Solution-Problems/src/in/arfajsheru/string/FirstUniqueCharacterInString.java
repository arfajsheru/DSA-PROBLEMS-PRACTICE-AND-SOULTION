package in.arfajsheru.string;

class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(solution("leetcode"));
    }


    public static int solution(String s){
        int i = 1;
        while (i < s.length()){
            if(s.charAt(0) == s.charAt(i)) {
                return i;
            }
            i++;
        }
        return 0;
    }
}
