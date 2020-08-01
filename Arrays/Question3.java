//3.Find the number occuring odd number of times in a given array of size 'n'
import java.util.*;
public class Question3{
    //brute Force
    public static int brute(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count%2 != 0)
                return arr[i];
        }
        return 0;
    }
    //Xor method
    public static int xorMethod(int[] arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter array element:");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Brute Force: "+brute(arr));
        System.out.println("XOR method: "+xorMethod(arr));
    }
}