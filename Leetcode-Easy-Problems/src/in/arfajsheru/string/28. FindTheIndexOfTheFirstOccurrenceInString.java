package in.arfajsheru.string;

class FindTheIndexOfTheFirstOccurrenceInString {
    public static int Solution(String haystack, String needle) {
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            // 0 < 6 - 3 + 1 = 4 true  1 < 6 - 3 + 1 = 4 true, 2 < 6 - 3 + 1 = 4true, 3 < 6 - 3 + 1 = 4 true  4  < 6 - 3 + 1 = 4 false
            int j = 0; // 1, 2
            while(j < needle.length()){ // 0 < 3 true, 1 < 3 true, 2 < true, 3 < 3 false
                 if(haystack.charAt(i + j) != needle.charAt(j)){  // b != s break, u != s break , t != s break,
                     // s != s false, a != a false , d != d false
                     break;
                 }
                 j++; // 1 , 2 , 3
            }
            if(j == needle.length()){ // 3 == 3 true
                return i; // 3
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println( Solution("butsad", "sad"));

    }
}


/*
* */