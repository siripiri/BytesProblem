//1.Find a pair in an array of size 'n', whose sum is X
import java.util.*;
public class Question1{
    public static void findPair(int[] arr,int X){
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            int temp = X-arr[i];
            if(hash.contains(temp))
                System.out.println(temp+" "+arr[i]);
            hash.add(arr[i]);
        }
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter Array Input:");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the sum X:");
        int X = scan.nextInt();
        findPair(arr,X);
    }
}