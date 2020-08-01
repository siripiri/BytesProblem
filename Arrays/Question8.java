//8.Algorithm to merge an array of size 'n' into another array of size 'm+n'.
import java.util.*;
public class Question8{
    public static int[] mergeArray(int[] m,int[] n){
        for(int i=m.length-1,j=m.length-1;i>=0;i--){
            if(m[i] != -1){
                m[j] = m[i];
                if(i!=j)
                    m[i] = -1;
                j--;
            }
        }
        for(int i=0;i<n.length;i++){
            m[i] = n[i];
        }
        Arrays.sort(m);
        return m;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter m:");
        int m = scan.nextInt();
        System.out.println("Enter the array elemtent :");
        int[] arr = new int[m];
        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter the array elemtent :");
        int[] arr1 = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = scan.nextInt();
        }
        arr = mergeArray(arr,arr1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}