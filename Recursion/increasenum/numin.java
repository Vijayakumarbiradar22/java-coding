package Recursion.increasenum;

public class numin {
    public static void printNum(int n){
        if(n==5){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String args[]){
        int n=1;
        printNum(n);
    }
    
}
