import java.util.*;
public class Question27{
    public static int[] rearrange(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i] += (arr[arr[i]]%arr.length)*arr.length;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] /= arr.length;
        }
        return arr;
    }
    public static void printArray(int[] arr){
        System.out.println("Enter array element:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element:");
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        arr = rearrange(arr);
        printArray(arr);
    }
}