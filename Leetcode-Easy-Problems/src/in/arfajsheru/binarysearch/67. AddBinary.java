package in.arfajsheru.binarysearch;

class AddBinary {
    public static void main(String[] args) {
        System.out.println(Solution("1010", "1011"));
    }

    public static String Solution(String a, String b){
        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());

        int carry = 0;
        for (int i = 0; i < maxLength; i++){
            // get index a and b
            int aIndex = (a.length() - 1) - i;
            int bIndex = (b.length() - 1) - i;

            //get char a nd b if no char exist return 0
            char aChar = aIndex >= 0 ? a.charAt(aIndex) : '0';
            char bChar = bIndex >= 0 ? b.charAt(bIndex) : '0';

            //convert char to int
            int aVal = aChar - '0';
            int bVal = bChar - '0';

            // niche ki value nikaalenge
            int sum = aVal + bVal + carry;
            /*
            * zero ke case me zero aayega
            * one ke case me one aayega
            * two ke case me 0 aayega
            * three ke case me one aayega
            */
            int res = sum % 2; // 0 % 2 ka result 0 hota he. 1 % 2 ka result 1 hota hai. 2 % 2 ka result 0 hota hai. 3 % 2 ka result 1 hota hai.
            carry = sum / 2; // 0 / 2 ka result 0 hota he. 1 / 2 ka result 0 hota he, 2 / 2 ka result 1 hota he, 3 / 2 ka result 1 hota he

            sb.append(res);
        }
        if(carry == 1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
