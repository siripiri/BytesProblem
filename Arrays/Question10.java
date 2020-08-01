//10.Algorithm to find duplicate elements in O(n) time and O(1) extra space, for a given array of size 'n'
import java.util.*;
import java.lang.Math;
public class Question10{
    public static void duplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[Math.abs(arr[i])]>0){
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
            }
            else{
                System.out.print(Math.abs(arr[i]) + " "); 
            }
        }
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter the array element: ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The duplicate number is "+duplicate());
    }
}