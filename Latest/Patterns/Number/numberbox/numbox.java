package Patterns.Number.numberbox;
import java.util.*;
public class numbox {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();
        int min=0;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int a=i;
                if(i>n) a=2*n-i;
                int b=j;
                if(j>n) b=2*n-i;
                if(a<b) min=a;
                else min=b;
                System.out.print(min+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
