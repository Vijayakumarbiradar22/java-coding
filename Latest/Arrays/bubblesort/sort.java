package Arrays.bubblesort;
import java.util.Scanner;
public class sort {
    public static void bubbleSort(int[] arr,int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr,n);
        System.out.println("Array in ascending order is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
