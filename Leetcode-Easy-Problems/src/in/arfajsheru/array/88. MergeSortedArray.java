package in.arfajsheru.array;
import java.util.Arrays;
class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        System.out.println(nums1.length);
        int[] nums2 = {2,5,6};
        Solution(nums1,3,nums2,3);

        System.out.println(Arrays.toString(nums1));
    }


    public static void Solution(int[] nums1, int m, int[] nums2, int n){
        for(int i = 0; i < n; i++){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
