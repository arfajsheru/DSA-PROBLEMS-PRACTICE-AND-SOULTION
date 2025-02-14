package in.arfajsheru.array;

import java.util.Arrays;

class MergerSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};

        Solution(arr1,3, arr2, 3);
        System.out.println(Arrays.toString(arr1));
    }

    public static void Solution(int[] arr1, int m, int[] arr2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = arr1.length - 1;

        while(j >= 0){
            if(i >= 0 && arr1[i] > arr2[j]){
                arr1[k] = arr1[i];
                i--;
            } else{
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
    }
}
