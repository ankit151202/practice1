public class slidingwindowalgo {
    public static void printsubArray(int[] arr, int n, int k) {
        int s=0;
        int e=0;
        while(e<n){
            int currWindowSize = e-s+1;
            if(currWindowSize<k){
                e++;
            }
            else if(currWindowSize==k){
                s++;
                e++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 3;
        printsubArray(arr, n, k);
    }
}
