package in.arfajsheru.binarysearch;

class arrangeCoing {
    public static void main(String[] args) {
        System.out.println(soultion(8));

    }


    public static int soultion(int num){
        int beg = 0 , end = num;
        while(beg <= end){
            int mid = (beg + end) / 2;
            int useCoinns = (mid * (mid + 1) / 2);
            System.out.println("usecoins = " + useCoinns);
            if(useCoinns == num){
                return mid;
            } else if(useCoinns > num){
                end = mid - 1;
            } else{
                beg = mid + 1;
            }
        }
        return end;
    }
}
