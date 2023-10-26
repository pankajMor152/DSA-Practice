package PatternsProblem;

//          *
//        * * *
//      * * * * *
//    * * * * * * *
//    * * * * * * *
//      * * * * *
//        * * *
//          *


import java.util.Scanner;

public class StarDiamond {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int stars = 1;
        int space = numb-1;
        for (int i = 1; i <= numb ; i++) {
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= stars ; k++) {
                System.out.print("*");
            }
            space--;
            stars+=2;
            System.out.println();
        }
        stars-=2;
        for (int i = 1; i <= numb ; i++) {
            for (int j = 1 ; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1 ; k <= stars ; k++) {
                System.out.print("*");
            }
            stars-=2;
            System.out.println();
        }
    }
}
