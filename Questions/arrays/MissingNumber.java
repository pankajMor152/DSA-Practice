package arrays;

//    Given an array nums containing n distinct numbers in the
//    range [0, n], return the only number in the range that is missing from the array.

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = (size*(size+1))/2;
        int arrSum = 0;
        for(int i = 0; i < nums.length; i++){
            arrSum+=nums[i];
        }
        return sum-arrSum;
    }

}
