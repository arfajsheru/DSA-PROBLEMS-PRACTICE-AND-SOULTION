package in.arfajsheru.array;

import java.util.Arrays;

class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = new int[] {0,0,0,0,1};
        moveZeroes(arr);
        System.out.println("OutPut is : " + Arrays.toString(arr));
    }


    public static void moveZeroes(int[] arr){
        int prev = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){ // 1 != 0 T
                int temp = arr[i]; // temp = 1
                arr[i] = arr[prev]; // 0Index = 1
                arr[prev] = temp; // 0Index = 1
                prev++;// prev++
            }
        }
    }
}
