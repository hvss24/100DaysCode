package Day3;
public class oddOrEven{
    public static void OddOrEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 1){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even Number");
        }
    }
    public static void main(String[] args) {
        OddOrEven(265687654);
    }
}