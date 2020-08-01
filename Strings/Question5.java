import java.util.*;
public class Question5{
    public static String reverse(String str){
        String[] arr = str.split(" ");
        str = "";
        for(int i=arr.length-1;i>=0;i--){
            str += arr[i]+" ";
        }
        return str;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(reverse(str));
    }
}