package Neetcode.Twopointers.sellstock;
import java.util.Scanner;
public class stock {
    public static int maxProfit(int nums[],int n){
       int lsf=Integer.MAX_VALUE;
       int op=0;
       int pist=0;
       
       for(int i=0;i<n;i++){
        if(nums[i]<lsf){
            lsf=nums[i];
        }
        pist=nums[i]-lsf;
        if(op<pist){
            op=pist;
        }
       }
       return op;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result = maxProfit(nums,n);
        System.out.println(result);

        sc.close();
    }
    
}
