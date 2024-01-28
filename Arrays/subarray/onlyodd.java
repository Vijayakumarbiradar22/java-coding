package Arrays.subarray;
import java.util.Scanner;
public class onlyodd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int od=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                od+=1;
            }
        }

        int[] arr1 = new int[od];
        int x=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                arr1[x]=arr[i];
                x++;
            }
        }

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        sc.close();
    }
    
}
