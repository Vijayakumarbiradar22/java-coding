package Neetcode.ArraysandHashing.longestconsequence;
import java.util.Scanner;
import java.util.*;
public class longseq {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements:");
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            int result=longestConseq(nums);
            System.out.println(result);
            sc.close();
    }
    
}
