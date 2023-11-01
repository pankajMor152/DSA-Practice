package miscellaneous;

public class PrimeCheck {
    public static void main(String[] args){
        System.out.println(isPrime(6));
    }

    public static boolean isPrime(int num) {
        if(num ==1 || num < 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
