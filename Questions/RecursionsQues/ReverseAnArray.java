package RecursionsQues;

public class ReverseAnArray {

    static int index = 0;
    public static int[] reverseArray(int n, int []nums) {
        if(index == n/2){
            return nums;
        }
        int first = nums[index];
        nums[index] = nums[(n-1)-index];
        nums[(n-1)-index] = first;
        index++;
       nums = reverseArray(n,nums);
        return nums;
    }
}
