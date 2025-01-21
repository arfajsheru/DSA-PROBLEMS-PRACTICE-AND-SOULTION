package in.arfajsheru.string;

class ReverseString {
    public static void main(String[] args) {
        char[] s = {'H','e','l','l','o','!',' ','H','i','i','.','.','.'};
        Solution(s);
        System.out.println("Reverse String: " + String.valueOf(s));
    }

    public static void Solution(char[] s){
        for(int i = 0; i < s.length / 2; i++){
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length -1 - i] = temp;
        }
    }
}
