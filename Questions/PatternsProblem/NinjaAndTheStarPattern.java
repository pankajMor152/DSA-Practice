package PatternsProblem;

public class NinjaAndTheStarPattern {
    public static void main(String[] args){

        getStarPattern(4);
    }
        public static void getStarPattern(int n) {
            for (int i = 1; i <= n; i++) {
                if(i == 1 || i == n){
                    for (int j = 1; j <= n ; j++) {
                        System.out.print("*");
                    }
                }
                else{
                    System.out.print("*");
                    for (int j = 1; j <= n-2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                System.out.println();
            }
        }

}
