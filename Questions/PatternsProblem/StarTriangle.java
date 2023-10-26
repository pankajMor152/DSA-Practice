package PatternsProblem;

//          *
//        * * *
//      * * * * *
//    * * * * * * *


import java.util.Scanner;

public class StarTriangle {
    public static void main(String args[]){
        Scanner starLines = new Scanner(System.in);
        int temp = starLines.nextInt();
        int stars = 1;
        for (int i = temp; i > 0; i--) {
            for(int j = i-1; j >0 ; j-- ){
                System.out.print(" ");
            }
            for(int k = 1; k <=stars ; k++){
                System.out.print("*");
            }
            stars+=2;
            System.out.println();
        }


    }

}
