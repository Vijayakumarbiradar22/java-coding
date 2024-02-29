package Neetcode.mathandgeometry.plusone;
import java.util.*;
public class oneplus {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int digits[]=new int[n];
        System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            digits[i]=sc.nextInt();
        }
        int result[]=plusOne(digits);
        for(int i=0;i<n;i++){
            System.out.print(digits[i]+" ");
        }
        
        sc.close();
    }
    
}
