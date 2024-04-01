package Arrays.oddoccurance;
import java.util.Scanner;
public class oddoc {
    public static int getOccurance(int arr[], int n){
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count%2!=0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(getOccurance(arr,n));

        sc.close();
    }
    
}
