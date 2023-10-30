package miscellaneous;

//      Find the number of digits of "n" that evenly divides "n".

public class CountDigits {
    public static void main(String[] args){
        System.out.println(countDigits(336));
    }
    public static int countDigits(int n){
        int count = 0;
        int numb  = n;
        while(numb>0){
            int temp = numb%10;
            if(temp == 0){
                numb/=10;
                continue;
            }
            if(n%temp==0){
                count++;
            }
            numb/=10;
        }
        return count;
    }
}
