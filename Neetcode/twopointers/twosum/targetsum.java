package Neetcode.twopointers.twosum;
import java.util.Scanner;
public class targetsum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result = findTarget(nums,n);
        System.out.println(result);
    }
    
}
