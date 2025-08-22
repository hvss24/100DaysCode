package Day6;

public class countSetBits{
    public static int CountSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
            //means  LSB = 1
            count++;
            }
            n = n >> 1;
        }
    return count;    
    }
    public static void main(String[] args) {
        int n =16;
        System.out.println(CountSetBits(n));
    }
}