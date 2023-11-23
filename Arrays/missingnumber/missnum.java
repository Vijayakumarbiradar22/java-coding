package Arrays.missingnumber;
import java.util.Scanner;
public class missnum {
    public static int findMissing(int arr[], int size){
        int sum=((size+1)*(size+2))/2;

        for(int i=0;i<size;i++){
            sum=sum-arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int size=sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of array:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            int result = findMissing(arr,size);
            System.out.println(result);
        sc.close();
    }
    
}
