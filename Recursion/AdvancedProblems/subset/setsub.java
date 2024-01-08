package Recursion.AdvancedProblems.subset;
import java.util.ArrayList;
public class setsub {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.println(subset.get(i)+ " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }

        //will add 
        
    }
    public static void main(String args[]){
      int n=3;
      ArrayList<Integer> subset = new ArrayList<>();
      findSubset(n,subset);   
    }
    
}
