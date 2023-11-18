package Arrays.leadersinarray;
import java.util.Scanner;
public class leader {
    public static void printLeader(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    break;
                }
                if(j==n){
                    System.out.println(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //int[] arr = {16,17,4,3,5,2};
        //int n=arr.length;
        printLeader(arr,n);
        sc.close();
    }
    
}
