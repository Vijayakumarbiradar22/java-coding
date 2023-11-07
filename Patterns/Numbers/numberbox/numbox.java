package Patterns.Numbers.numberbox;

public class numbox {
    public static void main(String args[]){
        int n=4;
        int min=0;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int a=i;
                if(i>n) a=2*n-i;
                int b=j;
                if(j>n) b=2*n-j;
                if(a<b) min=a;
                else min=b;
                System.out.print(n+1-min+ " ");
            }
            System.out.println();
        }
    }
    
}
