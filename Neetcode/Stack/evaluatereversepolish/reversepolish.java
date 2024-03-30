package Neetcode.Stack.evaluatereversepolish;
import java.util.*;
public class reversepolish {
    public static int evalRPN(String[] tokens){
        Stack<Long> stack = new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            if(tokens[i].length()==1 && tokens[i].charAt(0)<48){
              long integer2=stack.pop();
              long integer1=stack.pop();
              char operator=tokens[i].charAt(0);
              long resolvedAns=resolves(integer1,integer2,operator);
                stack.push(resolvedAns);
            } else {
                stack.push(Long.parseLong(tokens[i]));
            }
        }
        return stack.pop().intValue();
    }

    public static long resolves(long a,long b, char operator){
        if(operator=='+'){
            return a+b;
        } else if(operator=='-'){
            return a-b;
        } else if(operator=='*'){
            return a*b;
        } else {
            return a/b;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        String tokens[]=new String[n];
        System.out.println("Enter the tokens:");
        for(int i=0;i<n;i++){
            tokens[i]=sc.next();
        }
        int stackres=evalRPN(tokens);
        System.out.println(stackres);
        
        sc.close();
    }
    
}
