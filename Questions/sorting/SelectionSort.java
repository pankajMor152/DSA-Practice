package sorting;

public class SelectionSort {
    public static void main(String[] args){
       int[] arr = {2,6,9, 4, 1, 0};
       selectionSort(arr);

    }

    public static void selectionSort(int[] arr) {
        int size = arr.length;
        for(int i = 0 ; i < size-1 ; i++){
            for(int j = i+1; j < size; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println(arr[size-1]);
    }
}
