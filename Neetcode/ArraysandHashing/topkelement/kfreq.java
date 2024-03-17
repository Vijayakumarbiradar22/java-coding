package Neetcode.ArraysandHashing.topkelement;
import java.util.Scanner;
import java.util.*;
public class kfreq {
    public static int[] topKfrequency(int nums[],int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
        map.merge(i,1,Integer::sum);
        }
        List<Integer> list=new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b)-map.get(a));
        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i);
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter :");
        int k=sc.nextInt();
        int result[]= topKfrequency(nums,k);
        for(int i:result){
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
