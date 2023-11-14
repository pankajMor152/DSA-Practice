package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 13, 4, 1, 3, 6, 28};
        insertionSort(arr, arr.length);
    }
    public static void insertionSort(int[] arr, int size) {
        for(int i = 1; i<size; i++){
            int k = arr[i];
            int j = i-1;
            while( j>=0 && k < arr[j]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] =  temp;
                j--;
            }

        }
    }
}
