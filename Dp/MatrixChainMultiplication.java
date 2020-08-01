import java.util.*;
import java.lang.Math;
public class MatrixChainMultiplication{
    public static int matrix(int[][] dp,int n,int[] arr){
        for(int d=1;d<n-1;d++){
            for(int i=1;i<n-d;i++){
                int j = i+d;
                int min = Integer.MAX_VALUE;
                for(int k=i;k<=j-1;k++){
                    int q = dp[i][k] + dp[k+1][j] + (arr[i-1]*arr[j]*arr[k]);
                    if(q<min){
                        min = q;
                    }
                }
                dp[i][j] = min;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int n = 5;
        int[] arr = {5,4,6,2,7};
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++)
            Arrays.fill(dp[i],0);
        matrix(dp,n,arr);
    }
}