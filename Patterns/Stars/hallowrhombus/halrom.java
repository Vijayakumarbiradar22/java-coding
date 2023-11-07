package Patterns.Stars.hallowrhombus;

public class halrom {
    public static void main(String args[]){
        int n=6;
        for(int i=1;i<n;i++){
            for(int j=1;j<=2*n-1;j++){
                if(j==n+i-1 || j==n-i+1 || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=n-2;i>=1;i--){
            for(int j=1;j<=2*n-1;j++){
                if(j==n+i-1 || j==n-i+1 || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
