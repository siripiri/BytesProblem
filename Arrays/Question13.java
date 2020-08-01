//13.Algorithm to find the triplet whose sum is X.
import java.util.*;
public class Question13{
    public static void findTriplet(int[] arr,int x){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == x)
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                }
            }
        }
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements :");
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the sum of triplet : ");
        int x = scan.nextInt();
        System.out.println("The triple is");
        findTriplet(arr,x);
    }
}