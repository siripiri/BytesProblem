import java.util.*;
public class Question21{
    public static Scanner scan = new Scanner(System.in);
    public static char[] swap(char[] ch,int i,int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
    public static void nextGreatest(char[] num){
        int i=0;
        for(i=num.length-1;i>0;i--){
            if(num[i-1] < num[i]){
                break;
            }
        }
        if(i == 0){
            System.out.println("Not Possible");
            return;
        }
        if(i+1 >= num.length){
            num = swap(num,i,i-1);
        }
        else{
            int min_index = i;
            int min_element = num[i];
            for(int j=i+1;j<num.length;j++){
                if(num[j] < min_element){
                    min_element = num[j];
                    min_index = j;
                }
            }
            num = swap(num,i-1,min_index);
            Arrays.sort(num,i,num.length);
        }
        System.out.println("The next greatest number is:");
        for(int j=0;j<num.length;j++)
            System.out.print(num[j]);
    }
    public static void main(String[] args){
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
        nextGreatest(ch);
    }
}