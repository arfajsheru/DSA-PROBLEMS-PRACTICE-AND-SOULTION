package in.arfajsheru.string;

class LengthOfLastWord {
   public static int lengthoflastword(String s){
        s = s.trim();
     for(int i = s.length() - 1; i >= 0; i--){ // 11 - 1 = 10, 9, 8, 7, 6
         if(s.charAt(i) == ' '){ // a == ' ' false, v == ' 'false , a = ' 'false, j == ' ', ' ' == ' ' true
	   return s.length() - (i + 1); // 11 - (6 + 1) 11 - 7 = 4
       }
   }
	return s.length();
  }
    public static void main(String[] args) {
        System.out.println(lengthoflastword("DSA in Java"));

    }
}
