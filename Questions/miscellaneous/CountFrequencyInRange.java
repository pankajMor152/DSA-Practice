package miscellaneous;

//      You are given an array 'arr' of length 'n'containing integers within the range '1' to 'x'
//      Your task is to count the frequency of all elements from 1 to n.
public class CountFrequencyInRange {
    public static int[] countFrequency(int n, int x, int []nums){
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if(nums[i]<= n){
                arr[(nums[i]-1)] += 1;
            }
        }
        return arr;
    }

}
