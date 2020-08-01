import java.util.*;
public class MultistageGraph{
    public static void minPath(int[][] adj,int stages){
        int[] path = new int[adj.length];
        int[] dp = new int[adj.length];
        for(int i=adj.length-2;i>=0;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i;j<adj.length;j++){
                if(adj[i][j] == 0)
                    continue;
                int temp = adj[i][j]+c[j];
                if(temp < min){
                    min = temp;
                    path[i] = j;
                }
            }
            dp[i] = min;
        }
        System.out.println("The Path is: ");
        int i = dp[0];
        while(i != adj.length-1){
            printf("%d->",i+1);
            i = dp[i];
        }
        System.out.println(adj.length);
        return;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter no of vertices:");
        int n = scan.nextInt();
        System.out.println("Enter the adjacentcy matrix:");
        int[][] adj = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                adj[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter no of stages: ");
        int stages = scan.nextInt();
    }
}
/*
    Sample Input : v = 12 , stage = 4
 0 9 7 3 2 0 0 0 0 0 0 0
 0 0 0 0 0 4 2 0 0 0 0 0
 0 0 0 0 0 2 7 0 0 0 0 0
 0 0 0 0 0 0 0 11 0 0 0 0
 0 0 0 0 0 0 11 8 0 0 0 0
 0 0 0 0 0 0 0 0 6 5 0 0
 0 0 0 0 0 0 0 0 4 3 0 0
 0 0 0 0 0 0 0 0 0 5 6 0
 0 0 0 0 0 0 0 0 0 0 0 4
 0 0 0 0 0 0 0 0 0 0 0 2
 0 0 0 0 0 0 0 0 0 0 0 5
 0 0 0 0 0 0 0 0 0 0 0 0
 */