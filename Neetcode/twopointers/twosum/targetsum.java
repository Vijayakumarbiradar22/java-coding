package Neetcode.twopointers.twosum;
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
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        int[] result = findTarget(nums,target);
        System.out.println(result);

        sc.close();
    }
    
}
