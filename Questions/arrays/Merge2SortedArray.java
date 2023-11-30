package arrays;

import java.util.ArrayList;
import java.util.List;

public class Merge2SortedArray {
    public static List< Integer > sortedArray(int []a, int []b) {
        List<Integer> arr = new ArrayList<>();
        int x = 0;
        int y = 0;
        while(x < a.length && y < b.length ){
            if(a[x] < b[y] ){
                if(!arr.contains(a[x])){
                    arr.add(a[x]);
                }
                x++;
            }
            else{
                if(!arr.contains(b[y])){
                    arr.add(b[y]);
                }
                y++;
            }
        }
        while(x < a.length){
            if(!arr.contains(a[x])){
                arr.add(a[x]);
            }
            x++;
        }
        while(y < b.length){
            if(!arr.contains(b[y])){
                arr.add(b[y]);
            }
            y++;
        }
        return arr;
    }


    ///////////////////////////////////////////////////////////////////////////////////////


    public static List< Integer > sortedArrayAnother(int []a, int []b) {
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;



        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                    list.add(b[j]);
                }
                j++;
            }

        }

        while (i < n1) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
}
