package Day4;
public class getithBit{
    public static int getIthBit(int i, int n){
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
            return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int n = 8;
        int i = 3;
        System.out.println(getIthBit(i, n));
    }
}