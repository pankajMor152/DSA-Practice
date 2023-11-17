package arrays;

//  Given an integer array nums, rotate the array to the right by k steps, where k is non-negative

import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] arr = {-1};
        rotate(arr, 2);
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(1);
        newArr.add(2);
        newArr.add(3);
        newArr.add(4);
        newArr.add(5);
        newArr.add(6);
        rotateArrayList(newArr,3);

    }
    public static void rotate(int[] nums, int k) {
        int numsLength = nums.length;
        k %= numsLength;
        reverse(nums, 0 , numsLength-1 );
        reverse(nums, 0 , k-1);
        reverse(nums, k , numsLength-1);
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static ArrayList<Integer> rotateArrayList(ArrayList<Integer> arr, int k) {
        int arrSize = arr.size();
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.addAll(arr.subList(k, arrSize));
        newArr.addAll(arr.subList(0, k));
        return newArr;

    }
}
