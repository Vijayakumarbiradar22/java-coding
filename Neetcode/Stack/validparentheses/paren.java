package Neetcode.Stack.validparentheses;
import java.util.*;
public class paren {
    public static boolean isValid(String s){
       Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(')');
            } else if(c=='{'){
                stack.push('}');
            } else if(c=='['){
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=c){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        boolean result = isValid(s);
        System.out.println(result);
        sc.close();
    }
}