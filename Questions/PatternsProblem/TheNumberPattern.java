package PatternsProblem;

//      4 4 4 4 4 4 4
//      4 3 3 3 3 3 4
//      4 3 2 2 2 3 4
//      4 3 2 1 2 3 4
//      4 3 2 2 2 3 4
//      4 3 3 3 3 3 4
//      4 4 4 4 4 4 4


public class TheNumberPattern {
    public static void main(String[] args){
        createPattern(4);

    }

    public static void createPattern(int n ){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;
                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }
            System.out.println();
            }
    }
}
