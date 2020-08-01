import java.util.*;
public class Question25{
    public static Scanner scan = new Scanner(System.in);
    public static int[][] swap(int[][] arr,int a,int b){
        int temp = arr[a][b];
        arr[a][b] = arr[b][a];
        arr[b][a] = temp;
        return arr;
    }
    public static int[][] transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                arr = swap(arr,i,j);
            }
        }
        return arr;
    }
    public static int[][] reverseRow(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int k = 0;
            int j = arr[0].length-1;
            while(k<j){
                int temp = arr[k][i];
                arr[k][i] = arr[j][i];
                arr[j][i] = temp;
                k++;
                j--;
            }
        }
        return arr;
    }
    public static void printMatrix(int[][] arr){
        System.out.println("The matrix is:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = scan.nextInt();
            }
        }
        arr = transpose(arr);
        printMatrix(arr);
        arr = reverseRow(arr);
        printMatrix(arr);
    }
}