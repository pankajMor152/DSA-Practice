package arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] book = {198, 136, 330, 455, 709, 547, 203, 882, 464, 726, 339, 347, 985, 955, 771, 598, 131, 181, 56, 350, 504, 761, 554, 514, 431, 853, 424, 360, 75, 765, 135, 204, 957, 461, 171};
        read(35 ,book, 1092);
    }

    public static String read(int n, int []book, int target){

        for (int i = 0; i < n; i++) {
            int x = 1;
            while(x < n){
                int sum = book[i] + book[x];
                if(sum == target){
                    return "YES";
                }
                x++;
            }
        }
        return "NO";
    }
}
