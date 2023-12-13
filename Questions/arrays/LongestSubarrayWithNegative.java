package arrays;

public class LongestSubarrayWithNegative {
    public static int getLongestSubarray(int []nums, int k) {
        int sum  = 0;
        int sol = 0;
        int arrlength = nums.length;

        for (int i = 0; i < arrlength; i++) {
            for (int j = i; j < arrlength; j++) {
                sum += nums[j];
                if(sum == k){
                    sol = Math.max(sol, (j-i)+1);
                    if(sol == arrlength ){
                        return sol;
                    }
                }
            }
            sum = 0;

        }
        return sol;
    }
}
