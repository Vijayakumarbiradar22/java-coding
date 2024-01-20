package Neetcode.ArraysandHashing.targetsum;
import java.util.Scanner;
import java.util.*;
public class target {
    public static int[] twoSum(int[] nums, int target,int n){
        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;

    }
    public static void main(String rgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target num:");
        int target=sc.nextInt();

        int[] output = twoSum(nums,target,n);
        for(int i:output){
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
