//16.Algorithm to find the number of triangles that can be formed with three different array elements as three sides of triangles, for a given unsorted array of n elements
import java.util.*;
public class Question15{
    public static Scanner scan = new Scanner(System.in);
    public static boolean isTriangle(int a,int b,int c){
        if(a+b >= c && a+c >= b && b+c >= a){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter the array element:");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("The possible triangles are:");
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(isTriangle(arr[i],arr[j],arr[k])){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}