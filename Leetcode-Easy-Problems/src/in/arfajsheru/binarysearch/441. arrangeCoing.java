package in.arfajsheru.binarysearch;

class arrangeCoing {
    public static void main(String[] args) {
        System.out.println(soultion(10));

    }
    public static int soultion(int num){
        int beg = 0 , end = num; // 4,
        while(beg <= end){
            int mid = (beg + end) / 2; // 5,2,3,4
            System.out.println("mid = " + mid);
            int useCoinns = (mid * (mid + 1) / 2); // 15, 3 ,6 10
            System.out.println("usecoins = " + useCoinns);
            if(useCoinns == num){ // f,f, f, 10 == num
                return mid; // 4
            } else if(useCoinns > num){ //15 > 10T, 3 > numF, 6 > 10F
                end = mid - 1; // 5 - 1 = 4
            } else{
                beg = mid + 1; //2 + 1 = 3, 3 + 1 = 4
            }
        }
        return end;
    }
}
