import java.util.*;
import java.lang.Math;
class LCS{
    String str1;
    String str2;
    LCS(String str1,String str2){
        this.str1 = str1;
        this.str2 = str2;
    }
    public static Scanner scan = new Scanner(System.in);
    public int lcs(int i,int j){
        if(str1.length() == i || str2.length() == j){
            return 0;
        }
        else if(str1.charAt(i) == str2.charAt(j)){
            return 1+lcs(i+1,j+1);
        }
        else{
            return Math.max(lcs(i+1,j),lcs(i,j+1));
        }
    }
    public int dpSol(){
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],0);
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    public static void main(String[] args){
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        LCS l1 = new LCS(str1,str2);
        System.out.println("The length of longest sub-sequence of a string is: ");
        System.out.println("Using Recursion: "+l1.lcs(0,0));
        System.out.println("Using Dp: "+l1.dpSol());
    }
}