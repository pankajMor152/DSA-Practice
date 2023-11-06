package RecursionsQues;

public class SumOfFirstNNumbers {
    public static void main(String[] args){
        System.out.println(sumFirstN(3));
    }

    public static long sumFirstN(long n) {
        long sum = 0;
        long a = 1;
        sum = getSum(n, a, sum);
        return sum;
    }

    public static long getSum(long n , long a, long sum){
        if(a > n){
            return sum;
        }
        sum += a;
        a++;
        sum = getSum(n, a, sum);
        return sum;
    }

}
