package in.arfajsheru.math;

class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(solution(1));
    }

    public static int solution(int num){
        if(num <= 0){
            return 1;
        }

        int a = 0 , b = 1;
        for(int i = 2; i <= num; i++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
