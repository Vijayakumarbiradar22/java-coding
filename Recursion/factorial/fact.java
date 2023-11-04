package Recursion.factorial;

public class fact {
    public static int findFact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*findFact(n-1);
        }
    }
    public static void main(String args[]){
        int n=5;
        int result = findFact(n);
        System.out.println(result);
    }
    
}
