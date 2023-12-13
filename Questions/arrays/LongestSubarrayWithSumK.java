package arrays;

//  You are given an array 'a' of size 'n' and an integer 'k'.
//  Find the length of the longest subarray of 'a' whose sum is equal to 'k'.



public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 3};
        longestSubarrayWithSumK(a,2);

    }
    public static int longestSubarrayWithSumK(int []a, long k) {
        int arrLength = a.length;
        int x = 0;
        int start = 0;
        int subarr = 0;
        long sum = 0;

        while(x < arrLength){
            sum += a[x];
            while(sum > k){
                sum -= a[start];
                start++;
            }

            if(sum == k){
                subarr = Math.max(subarr , (x-start)+1);

            }

            x++;
        }
        return subarr;
    }
}
