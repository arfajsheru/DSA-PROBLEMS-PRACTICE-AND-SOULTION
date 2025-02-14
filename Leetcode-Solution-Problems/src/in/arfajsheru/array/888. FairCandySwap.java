package in.arfajsheru.array;

import java.lang.reflect.Array;
import java.util.Arrays;

class FairCandySwap {

    public static void main(String[] args) {
        int[] alissize = {1,3};
        int[] bobsize = {2};
        int[] result = solution(alissize, bobsize);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] alisesize, int[] bobsize){
        int Asum = 0, Bsum = 0;

        for(int num: alisesize)  Asum += num;
        for(int num: bobsize) Bsum += num;
        System.out.println("Asum= " + Asum + ", Bsum= " + Bsum);

        int diff = (Asum - Bsum) / 2;
        System.out.println("Diff = " + diff);


        for(int i = 0; i < alisesize.length; i++){
            for(int j = 0; j < bobsize.length; j++){
                if(alisesize[i] - bobsize[j] == diff){
                    return new int[] {alisesize[i], bobsize[j]};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
