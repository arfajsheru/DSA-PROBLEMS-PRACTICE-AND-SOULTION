package in.arfajsheru.math;

class UglyNumber {
    public static void main(String[] args) {
        System.out.println(Solution1(6));
        System.out.println(Solution2(6));
        System.out.println(Solution1(14));
        System.out.println(Solution2(14));

    }


    public static boolean Solution1(int num){
        if(num <= 0) return false;
        int[] factors = {2,3,5};
        for(int factor: factors){  // 2 : {2,3,5},
            while (num % factor == 0){ // 14 % 2 == 0 T, 7 % 2 = 1 == 0F 7 % 3 = 1 == 0F, 7 % 5 = 1 == 0F
                num /= factor; // 14 / 2 = 7,
            }
        }
        return num == 1; // 7 == 1, false
    }

    public static boolean Solution2(int num){
        if(num <= 0) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        return num == 1;
    }
}


/*
* number ko divide karke prime factor number dudhna he jo 2,3 or 5 ho if he to vo ugly number he nahi to vo ugly number nahi he.
*  */
