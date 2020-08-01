//14.Algorithm to find a sub array whose sum is X
import java.util.*;
public class Question14{
    public static int[] findSubArray(int[] arr,int x){
        int index_i = 0;
        int index_j = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<j;k++){
                    sum += arr[k];
                }
                if(sum == x){
                    index_i = i;
                    index_j = j;
                    int[] res = {index_i,index_j};
                    return res;
                }
            }
        }
        int[] res = {-1,-1};
        return res;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the sum:");
        int x = scan.nextInt();
        int[] index = findSubArray(arr,x);
        System.out.println("The Subarray is:");
        for(int i=index[0];i<index[1];i++){
            System.out.print(arr[i]+" ");
        }
    }
}