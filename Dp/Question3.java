import java.util.*;
import java.lang.Math;
public class Question3{
    public static Scanner scan = new Scanner(System.in);
    public static int min(int a,int b,int c){
        if(a<=b && a<=c){
            return a;
        }
        else if(b<=a && b<=c){
            return b;
        }
        else{
            return c;
        }
    }
    public static int minCost(int[][] arr,int m,int n){
        if(m < 0 || n < 0){
            return Integer.MAX_VALUE;
        }
        if(m == 0 && n == 0){
            return arr[m][n];
        }
        return arr[m][n]+min(minCost(arr,m-1,n-1),minCost(arr,m,n-1),minCost(arr,m-1,n));
    }
    public static int minCostDp(int[][] arr,int m,int n){
        int[][] dp = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dp[i],0);
        }
        dp[0][0] = arr[0][0];
        for(int i=1;i<m;i++){
            dp[i][0] = dp[i-1][0]+arr[i][0];
        }
        for(int i=1;i<n;i++){
            dp[0][i] += dp[0][i-1]+arr[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1])+arr[i][j];
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args){
        System.out.println("Enter the n:");
        int n1 = scan.nextInt();
        System.out.println("Enter the matrix:");
        int[][] arr = new int[n1][n1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter the destination postion:");
        int m = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(minCost(arr,m-1,n-1));
        System.out.println(minCostDp(arr,m,n));
    }
}