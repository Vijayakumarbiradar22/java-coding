package Neetcode.mathandgeometry.plusone;
import java.util.*;
public class oneplus {
    public static int[] plusOne(int[] digits){
        for(int i=digits.length;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
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
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
    
}

//out of bound error it will update soon.