package Strings.stringsequal;
import java.util.Scanner;
public class equal {
    public static boolean arrayStringsEqual(String[] word1,String[] word2){
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();

        for(String word:word1){
            str1.append(word);
        }

        for(String word:word2){
            str2.append(word);
        }

        String s1 = str1.toString();
        String s2 = str2.toString();

        if(s1.equals(s2)){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of string1:");
        int s1=sc.nextInt();
        String[] word1 = new String[s1];
        System.out.println("Enter the strings:");
        for(int i=0;i<s1;i++){
            word1[i]=sc.nextLine();
        }
        
        //String[] word1={"cd","a"};
        //String[] word2={"cd","a"};
        boolean result = arrayStringsEqual(word1,word2);
        System.out.println(result);
    }
    
}
