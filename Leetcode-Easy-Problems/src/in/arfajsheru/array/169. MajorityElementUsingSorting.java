package in.arfajsheru.array;

import java.util.Arrays;

class MajorityElementUsingSorting {
    public static void main(String[] args) {
        int[] myarr = {1,2,4,1,5,2,1,1,1,6,1,8,1};
        System.out.println(solution(myarr));
    }

    public static int solution(int[] myarr){
        Arrays.sort(myarr);
        System.out.println(Arrays.toString(myarr));
        return myarr[myarr.length / 2];
    }

}
