package in.arfajsheru.string;

class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n){
        if(n == 1) return "1";
        String prev = countAndSay(n - 1); // Recursive call ho raha he
        StringBuilder result = new StringBuilder();

        int count = 1;
        for(int i = 0; i < prev.length(); i++){
            if(i + 1 < prev.length() && prev.charAt(i) == prev.charAt(i + 1)){ // ye conditaion check kar rahi he ki prev string me uska aage koi number he ya nahi if he to usko current i or i + 1 se compare karo equal he to count ko ++ karo
                count++;
            }
            else {
                result.append(count).append(prev.charAt(i)); // prev String me uske aage ka number same nahi hoga to directly else condition add kar degi or apna number bnna legi
                count = 1;
            }
        }
        return result.toString();
    }
}
