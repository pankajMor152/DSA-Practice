package miscellaneous;

//    Find GCD/HCF and LCM of two numbers

public class GCDorHCFAndLCM {

    public static void main(String[] args){

        int gcd = getGCd(24,36);
        int lcm = (24 * 36)/gcd;
        System.out.println("GCD : " + gcd + " And " + "LCM : " + lcm);

    }

    public static int getGCd(int n, int m){
        while(n % m > 0){
            int rem = n % m;
            n = m;
            m = rem;
        }
    return m;
    }
}
