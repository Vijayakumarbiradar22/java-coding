package Neetcode.twopointers.sellstock;
import java.util.Scanner;
public class stock {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        

        sc.close();
    }
    
}
