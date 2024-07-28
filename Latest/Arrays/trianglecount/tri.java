package Arrays.trianglecount;
import java.util.*;
public class tri {
    public static int countTriangle(int arr[],int n){
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]>arr[k]){
                        count++;
                    }
                }
            }
        }
        return count;
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
        int result=countTriangle(arr,n);
        System.out.println(result);
        sc.close();
    }
    
}
