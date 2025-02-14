package in.arfajsheru.array;

class RemoveElement {
    public static int Solution(int[] arr, int val){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val){
                arr[index++] = arr[i];
                // if index i or index vali value equal nahi he to index me ith index vali value daalo or index++ kardo
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(Solution(new int[] {1,2,3,4,5,6,5}, 5));
    }
}
