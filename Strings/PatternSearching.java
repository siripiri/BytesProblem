import java.util.*;
public class PatternSearching{
    public static Scanner scan = new Scanner(System.in);
    public static String pattern(String txt,String pat){
        if(pat.length() > txt.length()){
            return "Not Possible";
        }
        String res = "";
        for(int i=0;i<txt.length()-pat.length();i++){
            String temp = txt.substring(i,i+pat.length());
            if(temp.equals(pat)){
                res += String.valueOf(i);
                res += " "; 
            }
        }
        return res.equals("") ? "Not Possible" : res;
    }
    public static void main(String[] args){
        String txt = scan.nextLine();
        String pat = scan.nextLine();
        System.out.print("The pattern is "+pattern(txt,pat));  
    }
}