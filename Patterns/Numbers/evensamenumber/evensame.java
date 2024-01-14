package Patterns.Numbers.evensamenumber;

public class evensame {
    public static void main (String args[]){
       int n=5;
       int num=2;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print(num);
            num=2;
        }
        System.out.println();
       } 
    }
    
}
