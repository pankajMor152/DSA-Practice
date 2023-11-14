package sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {4, 7, 8, 3, 1, 9};
        sort(arr, 0, 5);
        for (int i = 0; i <6 ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int[] arr, int l, int r){
        if(l >= r){
            return;
        }
        int mid = (l + r)/2;
        sort(arr, l, mid);
        sort(arr, mid+1, r);
        conquer(arr, l, r , mid);

    }
    public static void conquer(int[] arr, int l, int r, int mid){
        int[] temp = new int[r-l+1];
        int left  = l;
        int right = mid+1;
        int x = 0;
        while(left <= mid && right <= r){
            if(arr[left] <= arr[right]){
                temp[x++] = arr[left++];
            }
            else{
                temp[x++] = arr[right++];
            }

        }
        while(left <= mid){
            temp[x++] = arr[left++];
        }
        while(right <= r){
            temp[x++] = arr[right++];
        }
        for (int i = l; i <= r ; i++) {
            arr[i] = temp[i-l];
        }

    }

}
