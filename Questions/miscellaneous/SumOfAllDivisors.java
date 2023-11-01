package miscellaneous;

//      You are given an integer 'n'
//      Function 'sumOfDivisors (n)' is defined as the sum of all divisors of 'n'.
//      Find the sum of 'sumOfDivisors (i)' for all 'i' from 1 to 'n'.

public class SumOfAllDivisors {
    public static void main(String[] args){
        System.out.println(sumOfAllDivisors(4));
    }
    public static int sumOfAllDivisors(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += (n/i)*i;
        }
        return sum;
    }



//    public static int sumOfAllDivisors(int n){
//        int sum = 0;
//        for (int index = 1; index <= n; index++) {
//            for (int i = 1; i <= index; i++) {
//                if(index%i==0){
//                    sum += i;
//                }
//            }
//        }
//        return sum;
//    }
}
