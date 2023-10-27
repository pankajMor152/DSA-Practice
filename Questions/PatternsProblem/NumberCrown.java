package PatternsProblem;

//    1      1
//    12    21
//    123  321
//    12344321


import java.util.Scanner;

public class NumberCrown {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int space = (numb*2)-2;
        for (int i = 1; i <= numb ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= space ; k++) {
                System.out.print(" ");
            }
            for (int l = i; l >=1 ; l--) {
                System.out.print(l);
            }
            space-=2;
            System.out.println();
        }
    }


}
