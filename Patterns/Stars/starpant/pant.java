package Patterns.Stars.starpant;
import java.util.*;
public class pant {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n=sc.nextInt();
        int x=n;
        int y=n;

        for(int i=1;i<=n;i++){
            for(int j=1;j<n*2;j++){
                if(j>x&&j<y){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            x--;
            y++;
            System.out.println();
        }
        sc.close();
    }
    
}
