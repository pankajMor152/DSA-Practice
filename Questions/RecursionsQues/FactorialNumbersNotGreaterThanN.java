package RecursionsQues;

import java.util.ArrayList;
import java.util.List;

public class FactorialNumbersNotGreaterThanN {
    public static List<Long> arr = new ArrayList<>();
    public static int a =1;

    public static void main(String[] args){
        factorialNumbers(7);
    }

    public static List<Long> factorialNumbers(long n) {
        Long sum = 1l;
        sum = fact(a , sum);
        if(sum > n){
            return arr;
        }
        arr.add(sum);
        a++;
        factorialNumbers(n);
        return arr;
    }
    public static long fact(int a, Long sum){
        if(a<1){
            return sum;
        }
        sum *= a;
        a--;
        sum = fact(a, sum);
        return sum;
    }

}
