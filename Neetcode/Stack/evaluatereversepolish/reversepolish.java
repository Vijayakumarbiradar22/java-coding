package Neetcode.Stack.evaluatereversepolish;
import java.util.*;
public class reversepolish {
    public static int evalRPN(String[] tokens){
        Stack<Long> stack = new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            if(tokens[i].length()==1 && tokens[i].charAt(0)<48){
                
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        String tokens[]=new String[n];
        System.out.println("Enter the tokens:");
        for(int i=0;i<n;i++){
            tokens[i]=sc.nextLine();
        }
        int stackres=evalRPN(tokens);
        
        
        sc.close();
    }
    
}
