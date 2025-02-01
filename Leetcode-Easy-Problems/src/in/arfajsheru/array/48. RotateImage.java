package in.arfajsheru.array;

import java.util.Arrays;

class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        solution(matrix);
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void solution(int[][] matrix){
        int n = matrix.length;
            for(int i = 0; i < n; i++){
                for(int j = i; j < n; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n / 2; j++){

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n - 1 - j];
                    matrix[i][n - 1 - j] = temp;
                }
            }
    }

}
