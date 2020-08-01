//7.Find the maximum difference between two elements such that larger element appears after the smaller element
import java.util.*;
public class Question7{
    public static Scanner scan = new Scanner(System.in);
    public static int maxDiff(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min)
                min = arr[i];
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max-min;
    }
    public static void main(String[] args){
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Max Difference of the array is: "+maxDiff(arr));
    }
}