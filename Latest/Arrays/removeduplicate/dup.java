package Arrays.removeduplicate;
import java.util.*;
public class dup {
    public static void removeDuplicate(int[] arr,int n){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
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
        Arrays.sort(arr);
        removeDuplicate(arr,n); 
        sc.close();
    }
    
}
