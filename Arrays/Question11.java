//11.Find the index in an array such that the sum of elements at lower indices is equal to the sum of elements at higher indices.
import java.util.*;
public class Question11{
    public static Scanner scan = new Scanner(System.in);
    public static int equilibrium(int[] arr){
        int sum = arr[0];
        for(int i=1;i<arr.length;i++){
            sum += arr[i];
        }
        int leftSum = 0;
        for(int i=0;i<arr.length;i++){
            leftSum += arr[i];
            if(sum - leftSum == leftSum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println("Enter n: ");
        int n = scan.nextInt();
        System.out.println("Enter the array element : ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The equilibrium point is "+equilibrium(arr));
    }
}