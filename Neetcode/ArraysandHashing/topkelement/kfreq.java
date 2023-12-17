package Neetcode.ArraysandHashing.topkelement;
import java.util.Scanner;
public class kfreq {
    public static int[] topKfrequency(int nums[],int k){
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k=sc.nextInt();
        int result[]= topKfrequency(nums,k);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
    
}
