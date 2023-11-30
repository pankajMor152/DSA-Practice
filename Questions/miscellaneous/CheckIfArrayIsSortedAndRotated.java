package miscellaneous;

//      Given an array nums, return true if the array was originally sorted in non-decreasing order,
//      then rotated some number of positions (including zero). Otherwise, return false.
//      There may be duplicates in the original array.

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        CheckIfArrayIsSortedAndRotated obj = new CheckIfArrayIsSortedAndRotated();
        int[] nums = {3,2,1};
        obj.check(nums);
    }


    public boolean check(int[] nums) {
        int numsLength = nums.length;
        boolean apply = true;
        int x = 0;
        while(x < numsLength-1){
            if(nums[x] > nums[x+1] ){
                if(apply == true){
                   int numb = (numsLength-x)-1;
                    for(int i = 0; i < (numsLength/2); i++){
                        int temp = nums[i];
                        nums[i] = nums[numsLength-1-i];
                        nums[numsLength-1-i] = temp;
                    }

                    for(int i = 0; i < numb/2; i++){
                        int temp = nums[i];
                        nums[i] = nums[numb-1-i];
                        nums[numb-1-i] = temp;
                    }

                    for(int i = 0; i < (numsLength-numb)/2; i++){
                        int temp = nums[i+numb];
                        nums[i+numb] = nums[numsLength-1-i];
                        nums[numsLength-1-i] = temp;
                    }
                    x = -1;
                    apply = false;
                }
                else{
                    return false;
                }
            }
            x++;
        }
        return true;
    }
}
