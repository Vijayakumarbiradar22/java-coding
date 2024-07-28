package Arrays.segregateevenodd;
import java.util.*;
public class segregate {
    public static void segregateEvenOdd(int arr[],int n){
        int i=-1,j=0;
        while(j!=n){
            if(arr[j]%2==0){
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
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
        segregateEvenOdd(arr,n);
        sc.close();
    }
    
}
