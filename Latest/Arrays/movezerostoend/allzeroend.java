package Arrays.movezerostoend;
import java.util.*;
public class allzeroend {
    public static void pushZerosToEnd(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<n){
            arr[count]=0;
            count++;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
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
        pushZerosToEnd(arr,n);
        sc.close();
    }
    
}
