package Arrays.missingnumber;
import java.util.Scanner;
public class missnum {
    public static int findMissing(int arr[],int n){
        int sum = ((n+1)*(n+2)/2);

        for(int i=0;i<n;i++){
            sum=sum-arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = findMissing(arr,n);
        System.out.println(result);
        sc.close();

    }
}
