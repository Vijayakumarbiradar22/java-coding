package Arrays.leftrotatealgo;
import java.util.*;
public class reversal {
    public static void leftRotate(int arr[],int rt){
        if(rt==0){
            return;
        }
        int n=arr.length;
        rt=rt%n;
        reverseArray(arr,0,rt-1);
        reverseArray(arr,rt,n-1);
        reverseArray(arr,0,n-1);
    }
    public static void reverseArray(int arr[],int start,int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the rotation times:");
        int rt=sc.nextInt();
        leftRotate(arr,rt);
        printArray(arr);
        sc.close();
    }
    
}
