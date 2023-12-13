package arrays;


//   Given an array nums of size n, return the majority element.
//   The majority element is the element that appears more than ⌊n / 2⌋ times.
//   You may assume that the majority element always exists in the array.


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
//    public static int majorityElement(int []v) {
//        int key = 0;
//        int value = 0;
//        int temp = 0;
//        Map<Integer, Integer> hm = new HashMap<>();
//        for (int index = 0; index < v.length; index++) {
//            if(hm.containsKey(v[index])){
//                hm.put(v[index], hm.get(v[index])+1);
//            }
//            else{
//                hm.put(v[index], 1);
//            }
//        }
//        for(Integer entry : hm.keySet()){
//            value = Math.max(value, hm.get(entry));
//            if(value > temp){
//                key = entry;
//                temp = value;
//            }
//        }
//        return key;
//    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    public static int majorityElement(int []v) {
        Arrays.sort(v);
        return v[v.length/2];

    }

}
