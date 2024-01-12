package Recursion.decreasenum;

public class decnum {
    public static void decreaseNumber(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decreaseNumber(n-1);
    }
    public static void main(String args[]){
        int n=5;
        decreaseNumber(n);
    }
    
}
