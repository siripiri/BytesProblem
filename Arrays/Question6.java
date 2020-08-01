//6.Algorithm to segregate 0's and 1's in an array
import java.util.*;
public class Question6{
    // count 0's and 1's
    public static int[] count12(int[] arr){
        int count1 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0)
                count1++;
        }
        for(int i=0;i<count1;i++){
            arr[i] = 0;
        }
        for(int i=count1;i<arr.length;i++){
            arr[i] = 1;
        }
        return arr;
    } 
    // traverse using two pointers
    public static int[] traversePointers(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] == 0 && i<j)
                i++;
            if(arr[j] == 1 && i<j)
                j--;
            if(i<j){
                arr[i] = 0;
                arr[j] = 1;
                i++;j--;
            }
        }
        return arr;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter the array element:");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = scan.nextInt();
        arr = count12(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        arr = traversePointers(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}