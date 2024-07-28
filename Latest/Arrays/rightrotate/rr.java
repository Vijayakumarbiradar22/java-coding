package Arrays.rightrotate;
import java.util.Scanner;
public class rr {
    public static void rightRotate(int arr[],int size,int rt){
        int p=1;
        while(p<=rt){
            int last=arr[size-1];
            for(int i=size-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=last;
            p++;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the rotation times:");
        int rt=sc.nextInt();
        rightRotate(arr,size,rt);

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
