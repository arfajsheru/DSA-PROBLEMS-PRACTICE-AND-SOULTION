package in.arfajsheru.bitmanipulation;


class FindTheDifference {
    public static void main(String[] args) {
        System.out.println("Ouput is : " + solution("","y"));
        System.out.println("Ouput is : " + solution2("abcd","abcde"));
    }
    public static char solution(String s, String t) {
        char c = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            c ^= (char) (s.charAt(i) ^ t.charAt(i));
            System.out.println(c + "^= " + t.charAt(i)+ " ^ " + s.charAt(i));
        }
        return c;
    }

    public static char solution2(String s, String t){
        char c = 0;

        for(char ch : s.toCharArray()) c ^= ch;
        for(char ch : t.toCharArray()) c ^= ch;

        return c;
    }
}
