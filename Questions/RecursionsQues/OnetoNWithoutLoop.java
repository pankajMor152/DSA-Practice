package RecursionsQues;

public class OnetoNWithoutLoop {
    public static void main(String[] args){

        printNos(5);
    }

    public static int[] printNos(int x) {
        int[] arr = new int[x];
        int index = x-1;
        getArray(index, arr);
        return arr;
    }


    public static void getArray(int index , int[] arr){
        if(index < 0 ){
            return;
        }
        arr[index] = index+1;
        System.out.println(arr[index]);
        index--;
        getArray(index, arr);
    }

}
