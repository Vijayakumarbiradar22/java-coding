package Arrays.maxminmaxmin;
import java.util.*;
public class maxmin {
    public static void rearrange(int arr[],int n){
        Arrays.sort(arr);
        int temp[]=new int[n];
        int small=0;
        int large=n-1;

        boolean flag=true;

        for(int i=0;i<n;i++){
            if(flag){
                temp[i]=arr[large];
                large--;
            } else {
                temp[i]=arr[small];
                small++;
            }
            flag=!flag;
        }

        for(int i=0;i<n;i++){
            arr[i]=temp[i];
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
        rearrange(arr,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
