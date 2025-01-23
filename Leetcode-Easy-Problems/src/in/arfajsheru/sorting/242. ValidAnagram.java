package in.arfajsheru.sorting;

import java.util.Arrays;

class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(solution("anagram", "nagaram"));
    }

    public static boolean solution(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = s.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        return Arrays.equals(sCharArray,tCharArray);
    }
}
