package arrays;

//  There is an integer array 'a' of size 'n'.
//  An element is called a Superior Element if it is greater than all the elements present to its right.
//  You must return an array all Superior Elements in the array 'a'.
//  Note: The last element of the array is always a Superior Element.
//  Example
//      Input: a = [1, 2, 3, 2], n = 4
//      Output: 2 3

import java.util.ArrayList;
import java.util.List;

public class SuperiorElements {

    public static List< Integer > superiorElements(int []a) {
        List<Integer> arr = new ArrayList<>();
        int arrLength = a.length;
        int num = -1;
        for (int i = arrLength-1; i>=0; i--) {
            if(a[i] > num){
                arr.add(a[i]);
                num = a[i];
            }
        }
        return arr;
    }
}
