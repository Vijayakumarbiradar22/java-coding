package Searchalgo.binarysearch;
import java.util.Scanner;
public class binary {
    public static void binarySearch(int nums[],int target){
        int length=nums.length;
        int left=0;
        int right=length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                System.out.println(mid);
            } else if (nums[mid]<target){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target=sc.nextInt();

        binarySearch(nums,target);
        

        sc.close();
    }
    
}
