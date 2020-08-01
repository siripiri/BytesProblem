//5.Algorithm to rotate array of size 'n' by 'd' elements
import java.util.*;
public class Question5{
    public static int[] bruteForce(int[] arr,int d){
        for(int i=0;i<d;i++){
            int first = arr[0];
            for(int j=1;j<arr.length;j++)
                arr[j-1] = arr[j];
            arr[arr.length-1] = first;
        }
        return arr;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        System.out.println("Enter the array Element: ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter d:");
        int d = scan.nextInt();
        arr = bruteForce(arr,d);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}