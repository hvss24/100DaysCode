package Day7;

public class fastExponentiation{
    public static long FastExponentiation(long x, long n){//x^n
        long ans = 1;
        while(n > 0){
            if((n & 1) == 1){//if LSB = 1 
                ans = ans * x;
            }
            x = x * x; // square of base each time.
            n = n >> 1; // right shift the bitform each time.
        }
        return ans;  
    }
    public static void main(String args[]){
        System.out.println(FastExponentiation(5, 4));
    }
}







