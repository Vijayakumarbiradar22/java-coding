package Arrays.leadersinarray;
import java.util.*;
public class leader {
    public static void printLeader(int arr[],int n){
        for(int i=0;i<n;i++){
            int j;
            for(j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==n){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printLeader(arr,n);
        sc.close();
    }
    
}
