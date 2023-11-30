package miscellaneous;

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement {
    public static void main(String[] args) {
       int[] nums = {1,2,4};
        maxFrequency(nums, 5);
    }


//    public static int maxFrequency(int[] nums, int k) {
//        Arrays.sort(nums);
//        int numsLength = nums.length;
//        int freq = 1;
//        for(int i = numsLength-1; i>=0; i-- ){
//            int temp = nums[i];
//            int tempFreq = 1;
//            int tempK = k;
//
//             for(int j = i-1; j >= 0; j--){
//                 int numb = temp-nums[j];
//                  if( numb <= tempK ){
//                      tempFreq++;
//                      tempK-=numb;
//                      if(tempFreq > freq ){
//                          freq = tempFreq;
//                      }
//                  }
//                  else{
//                      break;
//                  }
//             }
//
//        }
//        return freq;
//    }


    //More Optimize Approach

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int size = nums.length;
        int freq = 0;
        


        return freq;
        }


    }
