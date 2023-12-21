package Sorting.quicksort;
import java.util.Scanner;
public class quick {
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pindx=partition(arr,low,high);

            quicksort(arr,low,pindx-1);
            quicksort(arr,pindx+1,high);
        }
    }

    public static int partition(int arr[],int low,int high){
        int pivot=high;
        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<arr[pivot]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[pivot];
        arr[high]=temp;
        return i;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}

