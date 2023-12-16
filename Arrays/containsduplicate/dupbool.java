package Arrays.containsduplicate;
import java.util.Scanner;
import java.util.*;
public class dupbool {
    public static boolean checkDuplicate(int nums[],int n){
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int nums[]= new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        checkDuplicate(nums,n);
    }
    
}
