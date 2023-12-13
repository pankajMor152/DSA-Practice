package arrays;


//   You are given a 0-indexed integer array nums of even length consisting
//   of an equal number of positive and negative integers.
//   You should rearrange the elements of nums such that the modified array follows the given conditions:
//   Every consecutive pair of integers have opposite signs.
//   For all integers with the same sign, the order in which they were present in nums is preserved.
//   The rearranged array begins with a positive integer.
//   Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

public class RearrangeArrayElementsBySign {

    public int[] rearrangeArray(int[] nums) {
        int even = 0;
        int odd = 1;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= 0 ){
                arr[even] = nums[i];
                even+=2;
            }
            else{
                arr[odd] = nums[i];
                odd+=2;
            }
        }
        return arr;
    }

}
