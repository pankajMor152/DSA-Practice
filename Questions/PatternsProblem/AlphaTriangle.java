package PatternsProblem;

//    D
//    D C
//    D C B
//    D C B A


import java.util.Scanner;

public class AlphaTriangle {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
        for (int lineNumb = 0; lineNumb < num ; lineNumb++) {
            for (char dispalyChar = (char)(64 + num); dispalyChar >= (char) (64+num-lineNumb) ; dispalyChar--) {
                System.out.print(dispalyChar);
            }
            System.out.println();
        }


    }
}
