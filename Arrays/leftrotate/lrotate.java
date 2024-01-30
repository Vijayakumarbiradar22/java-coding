package Arrays.leftrotate;
import java.util.Scanner;
public class lrotate {
    public static void leftrotate(int arr[],int n,int rt){
        int p=1;
        while(p<=rt){
            int last=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=last;
            p++;
        }
    }
    
    public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the :");
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
