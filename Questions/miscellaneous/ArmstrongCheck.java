package miscellaneous;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int count = 0;
        int temp = numb;
        int orgNumb = numb;
        while(temp > 0){
            temp/=10;
            count ++;
        }
        int ansr = 0;
        while(numb > 0){
            int digit = numb%10;
            ansr += Math.pow(digit, count);
            numb/=10;
        }
        if(ansr == orgNumb ){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

}
