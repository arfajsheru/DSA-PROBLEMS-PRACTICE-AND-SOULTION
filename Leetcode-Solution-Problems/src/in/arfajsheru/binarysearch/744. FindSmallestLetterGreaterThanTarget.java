package in.arfajsheru.binarysearch;

class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        // Smallest letter find karna he but array me se or vo target se bada hona chahiye
        char[] letters = {'b','d','e','f','j'};
        System.out.println(solution(letters,'f'));
        System.out.println(4 % 5);
    }

    public static char solution(char[] letters, char target){
        int beg = 0, end = letters.length - 1;

        while(beg <= end){
            int mid = beg + (end - beg) / 2;

            if(letters[mid] > target){
                end = mid - 1;
            } else{
                beg = mid + 1;
            }
        }
        return letters[beg % letters.length];
    }
        // if agar beg outof bound ho gaya to hame beg ki current value or letters ki length ko ham modulers karenge jis
        // hame first chahrcter milega.
}
