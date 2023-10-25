package PatternsProblem;

//        * * * *
//        * * * *
//        * * * *
//        * * * *


public class NForest {
    public static void main(String[] args){
        nForest(3);
    }

    public static void nForest(int n) {
        for(int i = 0; i < n ; i++){
            for(int j =0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
