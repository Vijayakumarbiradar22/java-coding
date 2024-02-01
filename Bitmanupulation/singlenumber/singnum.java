package Bitmanupulation.singlenumber;
import java.util.Scanner;
public class singnum {
    public static int singleNumber(int nums[]){
        int ans=nums[0];
        int i=0;

        while(i<nums.length-1){
            ans=ans^nums[i+1];
            i++;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array:");
        // int n=sc.nextInt();
        // int nums[]=new int[n];
        // System.out.println("Enter the eleements:");
        // for(int i=0;i<n;i++){
        //     nums[i]=sc.nextInt();
        // }
        // int res = singleNumber(nums);
        // System.out.println(res);
        // sc.close();
    }
    
}
