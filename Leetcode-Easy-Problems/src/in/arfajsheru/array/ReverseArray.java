package in.arfajsheru.array;

import java.lang.reflect.Array;
import java.util.Arrays;

class ReverseArray {
    public static void main(String[] args) {
        int[] myarr = {1,2,3,4,5,6,7,8,9,10};
        Solution(myarr);
        System.out.println("Reverse Array: " + Arrays.toString(myarr));
    }

    public static void Solution(int[] myarr){
        for(int i = 0; i < myarr.length / 2; i++){
            int temp = myarr[i];
            myarr[i] = myarr[myarr.length - 1 - i];
            myarr[myarr.length - 1 - i] = temp;
        }
    }
}
