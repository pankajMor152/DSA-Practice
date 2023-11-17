package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        System.out.println(removeDuplicates(arr, arr.size()));
    }

    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        Set<Integer> set = new HashSet<>(arr);
        return set.size();
    }
}
