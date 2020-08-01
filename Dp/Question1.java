import java.util.*;
public class Question1{
    public static Scanner scan = new Scanner(System.in);
    public static int lcs(int[] arr,int i){
        if(i+1 >= arr.length){
            return 1;
        }
        if(arr[i+1] > arr[i]){
            return 1+lcs(arr,i+1);
        } 
        else{
            return lcs(arr,i+1);
        }
    }
    public static int lcsDp(int[] arr){
        if(arr.length == 1){
            return 1;
        }
        int[] dp = new int[arr.length];
        Arrays.fill(dp,1);
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
            }
        }
        int max = 1;
        for(int i=0;i<arr.length;i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(lcs(arr,0));
        System.out.println(lcsDp(arr));
    }
}