package Day11;
public class pairSum{
    public static boolean PairSum(int arr[], int target){
        int i= 0;
        int j = arr.length-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum == target){
                return true;//pair found 
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        } 
        return false;//pair not found
    }
    public static void main(String[] args) {
        int arr[] = {2,3};
        int target = 5;
        System.out.println(PairSum(arr, target));
        //return false;
    }
}