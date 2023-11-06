package RecursionsQues;

public class PrintFibonacciSeries {
    public static int[] generateFibonacciNumbers(int n) {
        int[] arr = new int[n];
        int index = 2;
        arr[0]= 0;
        if(n == 1 || n < 1){
            return arr;
        }
        else if(n == 2){
            arr[1]=1;
            return arr;
        }
        else {
            arr[1]=1;
            return getFibonacci(arr, n, index);
        }
    }

    private static int[] getFibonacci(int[] arr,int n ,int index){
        if(index == n){
            return arr;
        }
        arr[index] = arr[index-1]+arr[index-2];
        index++;
        return getFibonacci(arr, n, index);
    }
}
