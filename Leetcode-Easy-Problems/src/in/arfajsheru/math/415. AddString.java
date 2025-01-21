package in.arfajsheru.math;

class AddString {
    public static void main(String[] args) {
        System.out.println(Solution("789", "123")); // Output: 912
    }

    public static String Solution(String num1, String num2) {
        int i = num1.length() - 1; // Pointer for num1
        int j = num2.length() - 1; // Pointer for num2
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            // Get digits or 0 if out of bounds
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            // Calculate sum and carry
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            sb.append(sum % 10); // Add current digit to result

            i--; // Move to next digit in num1
            j--; // Move to next digit in num2
        }

        return sb.reverse().toString(); // Reverse the result and return
    }
}
