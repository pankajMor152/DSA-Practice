package miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFrequencyElements {

    public static void main(String[] args){
        int[] arr = {1 ,2 ,3,1,1,4};
        int [] ansr = getFrequencies(arr);
        for (int i = 0; i < 2; i++) {
            System.out.println(ansr[i]);
        }

    }


    public static int[] getFrequencies(int []v) {
        int[] arr = new int[2];
        Map<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < v.length; i++) {
            if(hs.containsKey(v[i])){
                hs.put(v[i], hs.get(v[i])+1);
            }
            else{
                hs.put(v[i], 1);
            }
        }
        arr[0] = v[0];
        arr[1] = v[0];
        for (int i : hs.keySet()) {
            if(hs.get(i) >= hs.get(arr[0])){
                if(hs.get(i) == hs.get(arr[0])){
                    arr[0]= Math.min(i , arr[0]);
                }
                else{
                    arr[0] = i;
                }

            }
            if(hs.get(i) <= hs.get(arr[1])){
                if(hs.get(i)== hs.get(arr[1])){
                    arr[1] = Math.min(i , arr[1]);
                }
                else{
                    arr[1] = i;
                }

            }

        }
        return arr;

    }
}
