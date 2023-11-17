package arrays;

public class LeftRotateAnArrayByOne {

    static int[] rotateArray(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        return arr;
    }
}
