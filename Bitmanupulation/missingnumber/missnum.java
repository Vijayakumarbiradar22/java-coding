package Bitmanupulation.missingnumber;
import java.util.Scanner;
public class missnum {
    public static int missingNum(int nums[],int n){
       long actualSum=(n*(n+1))/2 ;
       long sum=0;
       for(int element:nums){
        sum+=element;
       }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        int result = missingNum(nums,n);
        System.out.println(result);
        sc.close();
    }
    
}
