package Neetcode.Stack.generateparantheses;
import java.util.*;
//import Sorting.insertionsort.insertion;
public class parentheses {
    public static List<String> generateparenthesis(int n){
        List<String> res = new ArrayList<String>();
        recurse(res,0,0,"",n);
        return res;
    }

    public static void recurse(List<String> res,int left,int right,String s,int n){
        if(s.length()==n*2){
            res.add(s);
            return;
        }

        if(left<n){
            recurse(res,left+1,right,s+"(",n);
        }

        if(right<left){
            recurse(res, left, right+1, s+")", n);
        }
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
