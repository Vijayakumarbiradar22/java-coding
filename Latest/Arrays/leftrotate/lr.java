package Arrays.leftrotate;
import java.util.*;
public class lr {
    public static void leftrotate(int arr[],int size,int rt){
        int p=1;
        while(p<=rt){
            int first=arr[0];
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            arr[size-1]=first;
            p++;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the rotation time:");
        int rt=sc.nextInt();
        leftrotate(arr,size,rt);

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
