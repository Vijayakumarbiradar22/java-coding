package Patterns.Stars.invertedhaltri;

public class invhal {
    public static void main(String args[]){
        int n=5;
        for(int i=n;i>0;i++){
            for(int j=1;j<=i;j++){
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
