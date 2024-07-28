package Arrays.secondlargest;
import java.util.*;
public class second {
    public static void findSecondLargest(int arr[],int n){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                second=arr[i];
            }
        }
        System.out.println("Second largest is:"+second);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findSecondLargest(arr,n);
        sc.close();
    }
    
}
