package Arrays.average;
import java.util.*;
public class avg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("Average of array is "+sum/n);

        sc.close();
    }
    
}
