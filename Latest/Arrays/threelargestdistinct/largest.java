package Arrays.threelargestdistinct;
import java.util.*;
public class largest {
    public static void find3Largest(int arr[],int n){
        int  third=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int first=Integer.MIN_VALUE;
        if(n<3){
            System.out.println("Invalid input");
        }

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third){
                third=arr[i];
            }
        }
        System.out.println("Three largest numbers are:"+first+" "+second+" "+third);
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
        find3Largest(arr,n);
        sc.close();
    }
    
}
