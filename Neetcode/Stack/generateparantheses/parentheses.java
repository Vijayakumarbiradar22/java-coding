package Neetcode.Stack.generateparantheses;
import java.util.*;

import Sorting.insertionsort.insertion;
public class parentheses {
    public static List<String> generateparenthesis(int n){
        List<String> res = new ArrayList<String>();
        recurse(res,0,0,"",n);
        return res;
    }

    public static void recurse(List<String> res,int left,int right,String s,int n){
        if()
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of parentheses:"); 
       int n=sc.nextInt();
        List<String> result = generateparenthesis(n);
        System.out.println(result);
       sc.close();
    }
}
