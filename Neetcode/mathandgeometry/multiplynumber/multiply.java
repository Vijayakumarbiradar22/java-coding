package Neetcode.mathandgeometry.multiplynumber;
import java.util.*;
public class multiply {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1:");
        String num1=sc.nextLine();
        System.out.println("Enter the String2:");
        String num2=sc.nextLine();
        String result = multiply(num1,num2);
        System.out.println(result);

        sc.close();
    }
    
}
