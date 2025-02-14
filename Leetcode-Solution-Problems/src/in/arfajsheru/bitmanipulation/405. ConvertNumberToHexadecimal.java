package in.arfajsheru.bitmanipulation;

class ConvertNumberToHexadecimal {
    public static void main(String[] args) {
        System.out.println(solution(11111111));    // "1"
        System.out.println(solution(-1));   // "ffffffff"
        System.out.println(solution(26));   // "1a"
        System.out.println(solution(-26));  // "ffffffda"
    }

    public static String solution(int num) {
        char[] hexaNumber = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        if(num == 0){ // if number == 0 he to 0 sting return kardo
            return "0";
        }

        StringBuilder sb = new StringBuilder(); // string builder banao
        for(int i = 0; i < 8; i++){ // i hamara 8 bar chalega kyu ki 32 bit hoti he hamari binary me 32 bites ko hexadecimal me  convert karne ke liye 32 / 4 = 8 digits chahiye hoti he
            int rem = num & 15; // 26 ka binary representation 0001 1010 thik to abhi extrect karenge (1111) 15 se 1010 & 1111, 0001 & 1111
            sb.insert(0,hexaNumber[rem]);
            num >>= 4; // ham right shift karte he jo divide kardega 16 se , 0001
        }

        int startIndex = 0;
        while(startIndex < sb.length() && sb.charAt(startIndex) == '0'){
            startIndex++; // jab talak zero aayega tab talak startIndex ko ++ karenge or jab 0 nahi aayega tab sb ke ander startIndex se value ko start karke return kar denge
        }
        return sb.substring(startIndex);
    }
}


/*
*         // Characters for hexadecimal representation (0-9 and a-f)
        char[] hexaNumber = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        // Special case for 0
        if (num == 0) {
            return "0";
        }

        // Handle negative numbers by using two's complement
        StringBuilder sb = new StringBuilder();
        // For 32-bit, we need 8 hex digits (since 4 bits per hex digit)
        for (int i = 0; i < 8; i++) {
            int rem = num & 15;  // Get the last 4 bits (hex value)
            sb.insert(0, hexaNumber[rem]);  // Convert to hexadecimal character
            num >>= 4;  // Right shift by 4 to get the next 4 bits
        }

        // Remove leading zeros (we need to skip leading zeros)
        int startIndex = 0;
        while (startIndex < sb.length() && sb.charAt(startIndex) == '0') {
            startIndex++;
        }

        // Return the result without leading zeros
        return sb.substring(startIndex);
    }
    * */