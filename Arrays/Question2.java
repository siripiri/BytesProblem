//2.Find a majority element in an array of size 'n'
import java.util.*;
public class Question2{
    // Morgee's voting algorithm
    public static int findCanditate(int[] arr){
        int canditate = arr[0];
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == canditate){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                canditate = arr[i];
                count = 1;
            }
        }
        return canditate;
    }
    public static int morgeeVoting(int[] arr){
        int canditate = findCanditate(arr);
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(canditate == arr[i])
                count++;
        }
        if(count >= arr.length/2)
            return canditate;
        return -1;
    }
    // brute force method
    public static int brute(int[] arr){
        int res = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count > max){
                max = count;
                res = arr[i];
            }
        }
        return res;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter array element:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Brute Force Method : "+brute(arr));
        System.out.println("Moorge's voting algorithm : "+morgeeVoting(arr));
    }
}