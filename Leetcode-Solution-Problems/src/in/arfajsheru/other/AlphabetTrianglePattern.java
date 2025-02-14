package in.arfajsheru.other;

public class AlphabetTrianglePattern {
    public static void main(String[] args) {
        solution(10);
    }

    public static void solution(int num){
        for(int i = num; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }
}
