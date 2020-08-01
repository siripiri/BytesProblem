import java.util.*;
public class Question26{
    public static Scanner scan = new Scanner(System.in);
    public static void match(int[] nuts,int[] bolts,int high,int low){
        if(low < high){
            int p = partition(nuts,high,low,bolts[high]);
            partition(bolts,high,low,nuts[p]);
            match(nuts,bolts,p-1,low);
            match(nuts,bolts,high,p+1);
        }
    }
    public static int partition(int[] arr,int high,int low,int pivot){
        int i = low;
        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = arr[i];
                i++;
            }
            else if(arr[j] == pivot){
                int temp = arr[j];
                arr[j] = arr[high];
                arr[high] = temp;
                j--;
            }
        }
        int temp1 = arr[i];
        arr[i] = arr[high];
        arr[high] = temp1;
        return i;
    }
    public static void printArray(int[] arr){
        System.out.println("the array elements: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int[] getInput(){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter the array element: ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static void main(String[] args){
        int[] bolts  = getInput();
        int[] nuts   = getInput();
        match(nuts,bolts,nuts.length-1,0);
        printArray(bolts);
        printArray(nuts);
    }
}