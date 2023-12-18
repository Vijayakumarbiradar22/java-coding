package Neetcode.ArraysandHashing.longestconsequence;
import java.util.Scanner;
import java.util.*;
public class longseq {
    public static int longestConseq(int[] nums){
        if(nums.length==0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }

        int count=1;

        for(int num:nums){
            if(!set.contains(num-1)){
                int tempCount=1;
                while(set.contains(num+1)){
                    tempCount++;
                    num++;
                }
                count=Math.max(count,tempCount);
            }
            if(count>nums.length/2){
                break;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
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
