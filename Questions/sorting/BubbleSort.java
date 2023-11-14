package sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        int swapped = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped =1;
                }
            }
            if (swapped == 0){
                break;
            }
        }
    }
}
