import java.util.*;
public class Question24{
    public static Scanner scan = new Scanner(System.in);
    public static int[] getInput(){
        System.out.println("Enter n:");
        int n = scan.nextInt();
        System.out.println("Enter array element:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static int maxPlatform(int[] arr,int[] dept){
        Arrays.sort(arr);
        Arrays.sort(dept);
        int i=1,j=0;
        int max = 1;
        int Platform = 1;
        while(i<arr.length && j<dept.length){
            if(arr[i]<=dept[j]){
                Platform++;
                i++;
            }
            else if(arr[i]>dept[j]){
                Platform--;
                j++;
            }
            if(max < Platform){
                max = Platform;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arrival = getInput();
        int[] departure = getInput();
        System.out.println("The maximium platform needed is: "+maxPlatform(arrival,departure));
    }
}