import java.util.*;
public class Question4{
    public static int maxPoss1(int[] arr,int k){
        int[][] dp = new int[arr.length+1][k+1];
        Arrays.fill(dp[0],0);
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(arr[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j]+dp[i][j-arr[i-1]];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static int maxPoss(int[] arr,int i,int k){
        if(k == 0){
            return 1;
        }
        if(k < 0){
            return 0;
        }
        if(i<0 && k>=1){
            return 0;
        }
        return maxPoss(arr,i-1,k) + maxPoss(arr,i,k-arr[i]);
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        System.out.println(maxPoss(arr,arr.length-1,k));
        System.out.println(maxPoss1(arr,k));
    }
}