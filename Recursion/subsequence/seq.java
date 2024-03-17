package Recursion.subsequence;
import java.util.Scanner;
public class seq {
    public static void subseq(String str,int indx,String newString){
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(indx);
        //to be
        subseq(str, indx+1, newString+currChar);

        //no to be
        subseq(str, indx+1, newString);
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string value:");
            String str = sc.nextLine();        
            subseq(str, 0, "");
            sc.close();
    }
}
