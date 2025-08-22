package Day5;

public class isPowerOf2 {
    public static boolean IsPowerOf2(int n){
        return ((n & n-1) == 0);
    }
    public static void main(String args[]){
       int n =16;
       System.out.println(IsPowerOf2(n));
    }
}
