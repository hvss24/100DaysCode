package Day10;
public class bubbleSort{
    public static void BubbleSort(int arr[]){
        for(int turn=1; turn<arr.length; turn++){
            boolean swapped = false;
            for(int j=0; j<arr.length-turn; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }   
    }
    public static void main(String args[]){
        int arr[] = {1,9,7,54,78,9};
        BubbleSort(arr);
        printArr(arr);
    }
}