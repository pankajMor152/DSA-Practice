package arrays;

public class MoveZeroesToEnd {
    public static int[] moveZeros(int n, int []a) {
        int[] arr = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            if(a[i]!=0){
                arr[x] = a[i];
                x++;
            }
        }
        return arr;
    }
}
