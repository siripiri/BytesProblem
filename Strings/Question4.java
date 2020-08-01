import java.util.*;
public class Question4{
    public static boolean isContains(String text,String pat){
        if(text.length() < pat.length()){
            return false;
        }
        int[] count_text = new int[256];
        int[] count_pat = new int[256];
        Arrays.fill(count_text,0);
        Arrays.fill(count_pat,0);
        int count = 0;
        for(int i=0;i<text.length();i++){
            count_text[text.charAt(i)]++;
        }
        for(int i=0;i<pat.length();i++){
            count_pat[pat.charAt(i)]++;
        }
        for(int i=0;i<pat.length();i++){
            if(count_text[pat.charAt(i)] != 0 || count_text[pat.charAt(i)] < count_pat[pat.charAt(i)]){
                return false;
            }
        }
        return true;
    }
    public static String window(String text,String pat){
        int min = Integer.MAX_VALUE;
        String res = "";
        for(int i=0;i<text.length();i++){
            for(int j=i+1;j<=text.length();j++){
                String sub = text.substring(i,j);
                if(isContains(sub,pat) && sub.length() < min){
                    res = sub;
                    min = sub.length();
                }
                //System.out.println(sub);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String pat = scan.nextLine();
        System.out.println("The smallest window is");
        System.out.println("Brute Force : "+window(text,pat));
    }
}