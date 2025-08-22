package Day8;
public class swapNumbers{
    public static void swapNumbers(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);    
    }
    public static void main(String[] args) {
        int a = 199;
        int b = 56;
        swapNumbers(a, b);
    }
}