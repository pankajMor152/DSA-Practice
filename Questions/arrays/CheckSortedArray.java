package arrays;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr ={0,0,0,1};
        int n = 4;
        isSorted(n, arr);
    }
    public static int isSorted(int n, int []a) {
        for (int i = 0; i < n/2; i++) {
            if(a[i] > a[i+1] || a[(n-1)-i] < a[(n-2)-i] ) {
                return 0;
            }
        }
        return 1;
    }
}
