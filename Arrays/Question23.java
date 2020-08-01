import java.util.*;
import java.lang.Math;
public class Question23{
    public static Scanner scan = new Scanner(System.in);
    public static int max(int i,int j,int[] arr){
        int max = arr[i];
        for(int k=i;k<=j;k++){
            if(arr[k]>max){
                max = arr[k];
            }
        }
        return max;
    }
    public static int rainWaterTapping(int[] arr){
        int left = arr[0];
        int right = 0;
        int sum = 0;
        int min = 0;
        for(int i=1;i<arr.length-1;i++){
            left = max(0,i-1,arr);
            right = max(i+1,arr.length-1,arr);
            min = Math.min(right,left);
            int temp = min-arr[i];
            if(temp>0)
                sum += temp;
        }
        return sum;
    }
    public static void main(String[] args){
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(rainWaterTapping(arr));
    }
}
/*
    Trapping Rain Water

    Given n non-negative integers representing an elevation map where the width of each bar is 1, 
    compute how much water it is able to trap after raining.

*/