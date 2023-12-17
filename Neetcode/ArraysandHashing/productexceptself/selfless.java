package Neetcode.ArraysandHashing.productexceptself;
import java.util.Scanner;
public class selfless {
    public static int[] productExceptSelf(int nums[],int n){
        int prefixProduct=1;
        int suffixProduct=1;
        
        int result[]=new int[n];

        for(int i=0;i<n;i++){
            
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int output[]=productExceptSelf(nums,n);
        for(int i:output){
            System.out.print(i+" ");
        }
    }
    
}
