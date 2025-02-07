package in.arfajsheru.binarysearch;

class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }

    public static boolean isPerfectSquare(int num){
        if(num < 2 ) return true; // 0 and 1 always perfect square.
        int beg = 2, end = num / 2;

        while(beg <= end){
            int mid = beg + (end - beg) / 2;
            int square = mid * mid;
            if(square == num) return true;
            if(square > num) end = mid - 1;
            else beg = mid + 1;
        }
        return false;
    }
}
