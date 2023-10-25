package miscellaneous;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        while(numb != 0){
            int temp = numb%10;
            if(temp%2 != 0){
                oddSum += temp;
            }
            else{
                evenSum += temp;
            }
            numb /= 10;
        }
        System.out.print("Even Digits Sum is : " + evenSum + " , " + "Odd Digits Sum is : " + oddSum);
    }
}
