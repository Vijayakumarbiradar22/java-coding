package Neetcode.mathandgeometry.xpowern;
import java.util.*;
public class power {
    public static double myPower(double x,int n){
        if(n<0){
            n=-n;
            x=1/x;
        }
        double pow=1;
        while(n!=0){
            if((n&1)!=0){
                pow*=x;
            }
            x*=x;
            n>>>=1;
        }
        return pow;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        double x=sc.nextDouble();
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        double result = myPower(x,n);
        
        sc.close();
    }
}
