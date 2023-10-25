package miscellaneous;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getFibonacciNumb(sc.nextInt()));

    }

    public static int getFibonacciNumb(int a){
        int[] arr = new int[a];
        arr[0]=1;
        if(a > 1){
            arr[1]=1;
            for(int i =2; i<a ; i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        return arr[a-1];
    }
}
