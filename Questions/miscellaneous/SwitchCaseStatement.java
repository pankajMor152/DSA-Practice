package miscellaneous;

public class SwitchCaseStatement {
    public static void main(String[] args){
        double[] a = {6};
        areaSwitchCase(1, a);


    }
    public static double areaSwitchCase(int ch, double []a) {
        double sol =0;
        switch(ch){
            case 1 :
                sol = 3.14*a[0]*a[0];
                System.out.println(sol);
                break;

            case 2 :
                sol = a[0]*a[1];
                System.out.println(sol);
                break;
        }
        return sol;
    }
}
