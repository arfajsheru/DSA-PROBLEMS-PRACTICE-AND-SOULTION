package in.arfajsheru.math;

class PowerOFFour {
    public static void main(String[] args) {
        System.out.println(solution(16));
    }

    public static boolean solution(int num){
        return num > 0 && (num & (num - 1)) == 0 && (num & 0xAAAAAAAA) == 0;
    }
}
/*
* If num power of 2 he to power of 4 bhi hoga vo
* If binary representaion number me 1 he to vo power of 2 hoga
* Or powr of four me 1 always odd position pe hota he
* If hame check karna he ki odd position pe he ki nah to iske liye ye formula he (n & 0xAAAAAAAA) == 0) 00xAAAAAAAA =  isk binar he ye 10101010 10101010 10101010 10101010
* isse vo check karega ki binary number 1 bit odd position pe he ki nahi agar nahi he to vo 0 return karega or 0 == 0 to vo true return karega
*
*
*
*
* so baically kya hai na ki 1 step n > 0 hona chahiye 2 step n ko & karn ahe n - 1  or zero aana chahiye or check karna he ki power of four me binary number 1 bit odd number pe hen ki nahi  */
