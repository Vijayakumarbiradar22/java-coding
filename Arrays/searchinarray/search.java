package Arrays.searchinarray;
import java.util.Scanner;
public class search {
    public static int search(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                    high=mid-1;
                } else {
                    
                }
            }
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array;");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        int result=search(nums,target);
        System.out.println(result);
        sc.close();
    }
    
}
