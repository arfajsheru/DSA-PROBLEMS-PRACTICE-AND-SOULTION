package in.arfajsheru.binarysearch;


class GuessNumberHigherOrLower {
    static int NumberToGuess;
    public static void main(String[] args) {
        GuessNumberHigherOrLower guesser = new GuessNumberHigherOrLower();
        NumberToGuess = 74;
        System.out.println("\nNumber is: " + guesser.guessNumberLinearSearch(100)); //using linear search
        System.out.println();
        System.out.println("\nNumbet is: " + guesser.guessNumberBinarySearch(100)); // using binary search

    }

    public int guessNumberLinearSearch(int n){
        for(int i = 0; i < n; i++){
            if(guess(i) == 0){
                return i;
            }
        }
        return -1;
    }

    public int guessNumberBinarySearch(int n){
        int beg = 1, end = n;
        while(beg <= end){
            int mid = beg + (end - beg) / 2;
            int res = guess(mid);
            if(res == 0) return mid;
            if (res == -1) end =  mid -1;
            else if(res == 1) beg = mid + 1;
        }
        return -1;
    }
    public int guess(int num){
        System.out.print(".");
        if(num == NumberToGuess) return 0;
        else if(num < NumberToGuess) return 1;
        return -1;
    }
}
