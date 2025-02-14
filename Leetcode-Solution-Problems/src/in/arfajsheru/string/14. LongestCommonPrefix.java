package in.arfajsheru.string;

class LongestCommonPrefix {
    public static String FindCommonPrefix(String[] str){
        //new String[]{"flower", "flow", "flying"}
	String result = " ";
	for (int i = 0; i < str[0].length(); i++) { // 0 < flower.length()= 0 < 5, 1 < 5 , 2 < 5
        char finding = str[0].charAt(i); // finding = f, finding = l, finding = o
        for (int j = 1; j < str.length; j++) { // ye pure string me iterate karega jab tak commaon prefix nahi mil jata
            if (str[j].length() <= i || str[j].charAt(i) != finding) { // 4 < 0 false 4 < 1 false 4 < 2 false 4 < 3 false 4 < 4 false
                // flow.length = 3, 3 <= 0 false || f != f = false, 3 <= 1 false || l != l false, 3 <= 2 false || o = o false
                return result;
            }
        }
        result += finding; // "" = "" + f = f,    f += l = fl
    }
    return result;
  }
    public static void main(String[] args) {
        System.out.println(FindCommonPrefix(new String[]{"flower", "flow", "floying"}));
        System.out.println(FindCommonPrefix( new String[]{"car", "dog", "racecar"}));

    }
}
