package Searchalgo.binarysearch;
import java.util.Scanner;
public class binary {
    public static int binarySearch(int nums[],int target,int n){
        int left=0;
        int right=n-1;

        while(left<=right){

            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target){
                left=mid+1;
            } else {
                right=mid-1;
            }
        }
        return -1;
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
        System.out.println("Enter a target value:");
        int target=sc.nextInt();

        int res = binarySearch(nums,target,n);
        System.out.println(res);
        sc.close();
    }
    
}
