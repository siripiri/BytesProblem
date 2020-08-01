import java.util.*;
public class Question2{
    public static String removeDup(String str){
        char[] ch =  str.toCharArray();
        int index = 0;
        for(int i=0;i<ch.length;i++){
            int j;
            for(j=0;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    break;
                }
            }
            if(i == j){
                ch[index] = ch[i];
                index++;
            }
        }
        return String.valueOf(Arrays.copyOf(ch,index));
    }
    public static String removeDup1(String str){
        LinkedHashSet<Character> hash = new LinkedHashSet<Character>();
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            hash.add(ch[i]);
        }
        str = "";
        for(char temp : hash){
            str += String.valueOf(temp);
        }
        return str;
    }
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        String str = scan.nextLine();
        System.out.println("The resultent string is : ");
        System.out.println("Brute Force: "+removeDup(str));
        System.out.println("using hash: "+removeDup1(str));
    }
}
/*

    2.Remove duplicates from a given string
    Given a string S, the task is to remove all the duplicates in the given string.

*/