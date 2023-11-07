package Arrays.sorting;
import java.util.Scanner;
public class sort {
    public static void bubbleSort(int arr[], int size){
        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the array elements:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            bubbleSort(arr,size);

            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
    
}
