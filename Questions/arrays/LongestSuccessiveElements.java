package arrays;

//  There is an integer array 'A' of size 'N'.
//  A sequence is successive when the adjacent elements of the sequence have a difference of 1.
//  You must return the length of the longest successive sequence.
//  Note:You can reorder the array to form a sequence.

import java.util.Arrays;

public class LongestSuccessiveElements {
    public static void main(String[] args) {
        int[] a = {15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8, 12, 17, 16, 6, 26, 3};
        longestSuccessiveElements(a);
    }

    public static int longestSuccessiveElements(int []a) {

        Arrays.sort(a);
        int num = a[0];
        int count = 0;
        int tempcount = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]==num){
                tempcount++;
                num++;
                count = Math.max(count, tempcount);
            }
            else if(a[i] == num-1){
            }
            else{
                tempcount = 0;
                num = a[i];
                i--;
            }
        }
        return count;
    }
}
