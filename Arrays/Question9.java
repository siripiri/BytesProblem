//9.Algorithm to find two repeating numbers in a given array.
import java.util.*;
public class Question9{
    // brute force methode
    public static int brute(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+2;j<arr.length;j++){
                if(arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }
    // Using Hash
    public static int usingHash(int[] arr){
        HashSet<Integer> hash = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(hash.contains(arr[i])){
                return arr[i];
            }
            hash.add(arr[i]);
        }
        return -1;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter the array element: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The two repeating numbers is: ");
        System.out.println("Brute Force : "+brute(arr));
        System.out.println("using hash : "+usingHash(arr));
    }
}