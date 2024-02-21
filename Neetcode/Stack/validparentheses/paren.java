package Neetcode.Stack.validparentheses;
import java.util.Scanner;
public class paren {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        String result = isValid(s);
        System.out.println(result);
        
    }
    
}
