package Arrays.rightrotate;
import java.util.Scanner;
public class rrotate {
    public static void rightRotate(int arr[],int n,int rt){
        int p=1;
        while(p<=rt){
            int first=arr[n-1];
            for(int i=n-2;i>=0;i--){
                arr[i+1]=arr[i];
            }
            arr[0]=first;
            p++;
        }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of rotation:");
        int rt = sc.nextInt();
        rightRotate(arr,n,rt);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        }
    }
    

