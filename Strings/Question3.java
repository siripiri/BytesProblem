import java.util.*;
public class Question3{
    public static boolean isRotated(String str1,String str2){
        if(str1.length() == str2.length() && (str1+str2).indexOf(str2) != -1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        System.out.println("Is rotated : "+isRotated(str1,str2));
    }
}
/*
1. A Program to check if strings are rotations of each other or not
Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
(eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)
*/