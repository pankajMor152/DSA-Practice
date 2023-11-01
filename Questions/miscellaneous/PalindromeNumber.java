package miscellaneous;

//  Given an integer x, return true if x is a palindrome, and false otherwise.

public class PalindromeNumber {
    public static void main(String[] args){
        System.out.println(palindromeNumber(121));
    }

    public static boolean palindromeNumber(int n){
        int numb  = 0;
        int temp = n;
        while(temp>0){
            numb += temp%10;
            temp/=10;
            if(temp > 0){
                numb*= 10;
            }
        }
        if(numb == n){
            return true;
        }
        else{
            return false;
        }
    }
}
