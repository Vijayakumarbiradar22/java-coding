package Neetcode.Twopointers.twosum;
import java.util.Scanner;
public class targetsum {
    public static int[] findTarget(int nums[],int target){
        for(int left=0,right=nums.length-1;left<right;){
            int sum=nums[left]+nums[right];

            if(sum==target){
                return new int[] {left+1,right+1};
            }else if(sum<target){
                left++;
            } else {
            right--;
            }
        }

        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n= sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter target element:");
        int target=sc.nextInt();
        int[] result = findTarget(nums,target);
        //System.out.println(result);
        //if (result[0] != -1 && result[1] != -1) {
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        //} 
        // else {
        //     System.out.println("Target sum not found in the array.");
        // }

        sc.close();
    }
    
}
