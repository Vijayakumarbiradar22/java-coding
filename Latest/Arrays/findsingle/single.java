package Arrays.findsingle;
import java.util.*;
public class single {
    public static int findSingle(int arr[],int n){
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }
        }
        return -1;
        
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
        findSingle(arr,n);
        sc.close();
    }
    
}
