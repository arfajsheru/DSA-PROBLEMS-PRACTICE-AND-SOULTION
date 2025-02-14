package in.arfajsheru.binarysearch;

class SquareRootX {
    public static void main(String[] args) {
        System.out.println(Solution(9));
    }

    public static int Solution(int x){ //
        int beg = 0, end = x; // end = 9, end = 3, beg = 2, beg = 3
        while(beg <= end){ // 0 <= 9 T, 0 <= 3T, 2 <= 3T
            int mid = beg + (end - beg) / 2; // (0 + (9 - 0) / 2 = 4, ( 0 + ( 3 - 0) / 2 = 1, (2 + (3 - 2)/ 2 = 2, 3
            long square = ((long) mid) * mid; // 16 , 1, 4, 9
            if(square == x){ // 16 == x F, 1 == 9F, 4== 9F, 9 == 9T
                return mid; // 3
            }
            else if(square > x){  // 16 > 9 T, 1 > 9F, 4 > 9F
                end = mid - 1; // 9 = 4 - 1 = 3
            } else {
                beg = mid + 1; // 0 = 1 + 1 = 2, 2 = 2 + 1 = 3,
            }
        }
        return end;
    }
}
