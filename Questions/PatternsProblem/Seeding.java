package PatternsProblem;

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//

import java.util.Scanner;

public class Seeding {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        for(int i = numb; i>0; i-- ){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

