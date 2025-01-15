package in.arfajsheru.array;

class RemoveElement {
    public static int Solution(int[] arr, int val){
        int index = 0; // 1, 2,
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val){
                arr[index++] = arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(Solution(new int[] {1,2,3,4,5,6,5}, 3));
    }
}
