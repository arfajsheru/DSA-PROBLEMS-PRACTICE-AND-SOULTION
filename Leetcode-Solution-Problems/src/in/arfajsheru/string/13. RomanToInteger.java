package in.arfajsheru.string;
class RomanToInteger {
    private final String [][] SYMBOL = new String[][] { // String two dimensional initialization
            {"I","1"},
            {"V","5"},
            {"X","10"},
            {"L","50"},
            {"C","100"},
            {"D","500"},
            {"M","1000"},
    };
    private int getSymbolValue(char symbol){  // I , V
        for (String[] row : SYMBOL) {
            if(row[0].equals(String.valueOf(symbol))){  // I == I, V = V
                return  Integer.parseInt(row[1]);  // 1,
            }
        }
        return 0;
    }
    
    private int romanToInt(String mystring){
        int result = 0;
        for (int i = 0; i < mystring.length(); i++) {
            char current = mystring.charAt(i); // current = L , D
            int currentVal = getSymbolValue(current); // currentVal = 50, 500

            if (i + 1 < mystring.length()) { // 1 < 3
                char next = mystring.charAt(i + 1); // next = C
                int nextVal = getSymbolValue(next); // nextVal = 100

                if (nextVal <= currentVal) {  // 100 <= 50 false
                    result += currentVal;
                } else {
                    result += nextVal - currentVal; // 0 += 100 - 50
                    i++; // i = 2
                }
            } else {
                result += currentVal;  // 50  = 50 + 500
            }
        }
        return  result; // 50 , 550
    }
    public static void main(String[] args) {
        RomanToInteger romantointeger = new RomanToInteger();
        System.out.println(romantointeger.romanToInt("IV"));
        System.out.println(romantointeger.romanToInt("LCD")); // example done
        System.out.println(romantointeger.romanToInt("IVD"));
        System.out.println(romantointeger.romanToInt("MDC"));

    }
}

