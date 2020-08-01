import java.util.*;
import java.lang.Math;
public class AllPairOfShortestPath{
    public static Scanner scan = new Scanner(System.in);
    public static int[][] shortestPath(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                    arr[j][k] = Math.min(arr[j][k],arr[j][i]+arr[i][k]);
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        scan.nextLine();
        for(int i=0;i<arr.length;i++){
            String line = scan.nextLine();
            String[] num = line.split(" ");
            for(int j=0;j<num.length;j++){
                if(num[j].equals("INF")){
                    arr[i][j] = 32767; 
                }
                else{
                    arr[i][j] = Integer.valueOf(num[j]);
                }
            }
        }
        arr = shortestPath(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
    Sample Input:
        n = 4
        matrix = 
        0 3 INF 7
        8 0 2 INF
        5 INF 0 1
        2 INF INF 0
*/