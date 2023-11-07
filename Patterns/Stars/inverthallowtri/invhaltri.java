package Patterns.Stars.inverthallowtri;

public class invhaltri {
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=2*n-1;j++){
                if(j==n-i+1 || j==n+i-1 || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
