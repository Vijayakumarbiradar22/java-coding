package Arrays.repeatingele;
import java.util.Scanner;
public class repeat {
    public static int printRepeat(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    // public static void printRepeat(int arr[],int size){
    //     for(int i=0;i<size-1;i++){
    //         for(int j=i+1;j<size;j++){
    //             if(arr[i]==arr[j]){
    //                 System.out.println("Repeating elements are:"+arr[i]+" ");
    //             }
    //         }
    //     }
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int result = printRepeat(arr,n);
        System.out.println(result);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array:");
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        // System.out.println("Enter the elements:");
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // printRepeat(arr,size);
        // sc.close();
    }
    
}

//input :- 4 2 4 5 2 3 1
//output:- 4 2