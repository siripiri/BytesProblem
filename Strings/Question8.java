import java.util.*;
public class Question8{
    public static String encoding(String str){
        char[] ch = str.toCharArray();
        str = "";
        for(int i=0;i<ch.length;i++){
            int count = 0;
            while(i<ch.length-1 && ch[i]==ch[i+1]){
                count++;
                i++;
            }
            str += String.valueOf(ch[i])+String.valueOf(count+1);
        }
        return str;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("The Running Encoding is : "+encoding(str));
    }
}