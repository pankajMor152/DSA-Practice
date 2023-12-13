package arrays;

//      Given an integer array nums, find the subarray
//      with the largest sum, and return its sum.

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxsum = Math.max(maxsum , sum);
            if(sum < 0 ){
                sum = 0;
            }
        }
        return maxsum;
    }
}
