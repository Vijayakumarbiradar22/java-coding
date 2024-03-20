package Arrays.countinversion;
import java.util.Scanner;
public class inversion {
    public static int getInversion(int arr[],int size){
        int inv_count=0;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    inv_count++;
                }
            }
        }
        return inv_count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Total Number of inversions are "+getInversion(arr,size));
        sc.close();
    }
    
}
