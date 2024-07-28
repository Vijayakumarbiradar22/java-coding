package Arrays.distinctprint;
import java.util.*;
public class distinct {
    public static void printDistinct(int arr[],int n){
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    break;
                }
            }
            if(i==j){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printDistinct(arr,n);
        sc.close();
    }
    
}
