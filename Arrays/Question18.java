import java.util.*;
public class Question18.{
    public static Scanner scan = new Scanner(System.in);
    public static int[] getInput(){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        return arr;
    }
    public static void common(int[] arr1,int[] arr2,int[] arr3){
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length && k<arr3.length){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                System.out.print(arr[i]+" ");
                i++;k++;j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j] < arr3[k]){
                j++;
            }
            else{
                k++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr1 = getInput();
        int[] arr2 = getInput();
        int[] arr3 = getInput();
        System.out.println("The common elements present in three arrays is: ");
        common(arr1,arr2,arr3);
    }
}