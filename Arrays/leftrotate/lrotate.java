package Arrays.leftrotate;
import java.util.Scanner;
public class lrotate {
    
    public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the size of array:");
           int n = sc.nextInt();
           int arr[]=new int[n];
           System.out.println("Enter the elements:");
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
           System.out.println("Enter the rotation times:");
           int rt=sc.nextInt();

           leftrotate(arr,n,rt);

           for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
           }

           sc.close();

    }
    
}
