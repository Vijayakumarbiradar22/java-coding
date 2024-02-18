package Sorting.selectionsort;
import java.util.Scanner;
public class selection {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        // for(int i=0;i<n-1;i++){
        //     int smallest = i;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[smallest]>arr[j]){
        //             smallest=j;
        //         }
        //     }
        //     int temp=arr[smallest];
        //     arr[smallest]=arr[i];
        //     arr[i]=temp;
        // }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }
    
}
