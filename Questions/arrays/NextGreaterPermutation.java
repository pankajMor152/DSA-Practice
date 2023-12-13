package arrays;

//   A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
//  For example, for arr = [1,2,3], the following are all the permutations of
//  arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
//  The next permutation of an array of integers is the next lexicographically greater
//  permutation of its integer. More formally, if all the permutations of the array
//  are sorted in one container according to their lexicographical order,
//  then the next permutation of that array is the permutation that follows it in the sorted container.
//  If such arrangement is not possible, the array must be rearranged as the lowest possible order
//  (i.e., sorted in ascending order).
//  For example, the next permutation of arr = [1,2,3] is [1,3,2].
//  Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
//  While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not
//  have a lexicographical larger rearrangement.
//  Given an array of integers nums, find the next permutation of nums.
//  The replacement must be in place and use only constant extra memory.



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextGreaterPermutation {

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(6);
        ls.add(10);
        ls.add(8);
        ls.add(13);
        ls.add(13);
        nextGreaterPermutation(ls);
    }
//    public static List< Integer > nextGreaterPermutation(List<Integer> a) {
//        for (int i = a.size()-1; i >= 0 ; i--) {
//            for (int j = i-1; j >= 0; j--) {
//                if(a.get(j) < a.get(i) ){
//                    a.add(j, a.get(i));
//                    a.remove(i);
//                    return a;
//                }
//
//            }
//        }
//        Collections.sort(a);
//        return a;
//    }

    public static List< Integer > nextGreaterPermutation(List<Integer> a) {
        int index = -1;
        int arrLength = a.size();
        for (int i = arrLength-2; i >= 0; i--) {
            if(a.get(i) < a.get(i+1)){
                index = i;
                break;
            }
        }
        if(index == -1){
            Collections.sort(a);
            return a;
        }

        for(int i = arrLength-1; i > 0; i--){
            if(a.get(i) > a.get(index)){
                int temp = a.get(index);
                a.set(index, a.get(i));
                a.set(i, temp);
                break;
            }
        }
        int num = (arrLength-1-index)/2;
        for (int i = 0; i < num; i++) {
            int temp = a.get(index+1+i);
            a.set(index+1+i, a.get(arrLength-1-i));
            a.set(arrLength-1-i, temp);
        }
        return a;
    }
}
