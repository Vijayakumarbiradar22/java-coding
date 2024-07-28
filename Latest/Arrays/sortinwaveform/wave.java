package Arrays.sortinwaveform;
import java.util.*;
public class wave {
    public static void sortWave(int arr[],int n){
        Arrays.sort(arr);
        for(int i=0;i<n-1;i+=2){
            swap(arr,i,i+1);
        }

    }

    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortWave(arr,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
