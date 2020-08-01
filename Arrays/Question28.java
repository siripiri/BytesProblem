import java.util.*;
public class Question18{
    public static void printSpiral(int[][] arr,int n,int m){
        int k=0;
        int l=0;
        while(k<m && l<n){
            for(int i=l;i<n;i++){
                System.out.print(arr[k][i]+" ");
            }
            k++;
            for(int i=k;i<m;i++){
                System.out.print(arr[i][n-1]+" ");
            }
            n--;
            if(k<m){
                for (int i = n - 1; i >= l; --i) { 
                    System.out.print(arr[m - 1][i] + " "); 
                } 
                m--;
            }
            if (l < n) { 
                for (int i = m - 1; i >= k; --i) { 
                    System.out.print(arr[i][l] + " "); 
                } 
                l++; 
            } 
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        printSpiral(arr,n,m);
    }
}