import java.util.*;
public class Anagram{
    public static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        str1 = String.valueOf(ch1);
        str2 = String.valueOf(ch2);
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
    public static boolean isAnagram1(String str1,String str2){
        int[] ch = new int[256];
        Arrays.fill(ch,0); 
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            ch[str1.charAt(i)]++;
            ch[str2.charAt(i)]--;
        }
        for(int i=0;i<256;i++){
            if(ch[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str2 = scan.nextLine();
        String str1 = scan.nextLine();
        System.out.println("Brute force: "+isAnagram(str1,str2));
        System.out.println("Efficient method: "+isAnagram1(str1,str2));
    }
}