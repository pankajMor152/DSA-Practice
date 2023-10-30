package miscellaneous;


// Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
// then return 0.

public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        int a  = 1;
        if(x<0){
            x*=-1;
            a *= -1;
        }
        long numb =0;
        while(x > 0){
            numb += x%10;
            x/=10;
            if(x>0) {
                numb *= 10;
            }
        }
        if (-2147483648>numb || numb>2147483647){
           return 0;
        }

        return (int) (a*numb);
    }
}
