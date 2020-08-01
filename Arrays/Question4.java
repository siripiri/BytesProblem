//4.Algorithm to reverse an array
import java.util.*;
public class Question4{
    public static int[] reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        return arr;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        arr = reverse(arr);
        System.out.println("The reversed array element is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}