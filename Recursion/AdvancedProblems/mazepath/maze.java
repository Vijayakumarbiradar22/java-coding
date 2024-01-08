package Recursion.AdvancedProblems.mazepath;

public class maze {
    
    public static void main(String args[]){
      int n=3;
      int m=3;
      int totalpath = countPath(0,0,n,m);
      System.out.println(totalpath);  
    }
    
}
