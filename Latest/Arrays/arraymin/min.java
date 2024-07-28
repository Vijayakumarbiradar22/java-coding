package Arrays.arraymin;
import java.util.*;
public class min {
    public static int findMin(int[] arr,int n){
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=findMin(arr,n);
        System.out.println(result);
        sc.close();
    }
    
}
