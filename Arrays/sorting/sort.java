package Arrays.sorting;
import java.util.Scanner;
public class sort {
    
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int n = sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter the elements:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            bubbleSort(arr,n);

            for(int i=0;i<n;i++){
                
            }
        

    }
    
}
