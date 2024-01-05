package Recursion.stackheight;
import java.util.*;
public class sh {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x:");
        int x= sc.nextInt();
        System.out.println("Enter the n:");
        int n = sc.nextInt();

        int result=calcPow(x,n);
        System.out.println(result);

        sc.close();

    }
    
}
