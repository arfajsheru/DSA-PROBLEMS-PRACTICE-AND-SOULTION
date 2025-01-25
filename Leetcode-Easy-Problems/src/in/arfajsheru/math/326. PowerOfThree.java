package in.arfajsheru.math;

class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(solution(27));
    }

    public static boolean solution(int num){
        if(num <= 0){
            return false;
        }
        System.out.println("num=" + "%" + "3" +"==" + "0");
        while(num % 3 == 0){
            num = num / 3;
            System.out.println("num" + "=" + "num" + "/" + "3= " + num + " ");
        }
        return num == 1;
    }
}
