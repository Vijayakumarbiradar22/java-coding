package Arrays.subarraysumequalstok;
import java.util.*;
public class subsumk {
    public static int subSumEqualsK(int[] nums, int k){
        int res=0;
        int curr=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i:nums){
            curr+=i;
            res+=map.getOrDefault(curr-k, 0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the lements of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        int result=subSumEqualsK(nums,k);
        System.out.println(result);
        sc.close();
    }
    
}
