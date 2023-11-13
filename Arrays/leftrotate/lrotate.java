package Arrays.leftrotate;
import java.util.Scanner;
public class lrotate {
    public static void leftRotate(int arr[],int size, int rt){
        int p=1;
        while(p<=rt){
            int last=arr[0];
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            arr[size-1]=last;
            p++;
        }
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            int size=sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements of array:");
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the rotation times");
            int rt=sc.nextInt();

            leftRotate(arr,size,rt);

            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
        }

    }
    
}
