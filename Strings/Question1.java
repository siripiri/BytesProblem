import java.util.*;
public class Question1{
    public static char maxCount(String str){
        int[] count = new int[256];
        char maxChar = str.charAt(0);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            char temp = str.charAt(i);
            count[temp]++;
            if(max < count[temp]){
                max = count[temp];
                maxChar = temp;
            }
        }
        return maxChar;
    } 
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        String str = scan.nextLine();
        System.out.println("The maximum character in the string '"+str+"' is = "+maxCount(str));
    }
}

/*
1. Return maximum occurring character in an input string
Write an efficient function to return maximum occurring character in the input string e.g., 
if input string is “test” then function should return ‘t’.
*/