package Arrays.runningsum;
import java.util.Scanner;
public class run {
    // public static int[] findRunningSum(int num[],int n){
    //     int[] result=new int[n];
    //     result[0]=num[0];
    //     for(int i=1;i<n;i++){
    //         result[i]=num[i]+result[i-1];
    //     }
    //     return result;
    // }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        int[] output = findRunningSum(num,n);
        for(int i=0;i<n;i++){
        System.out.print(output[i]+" ");
        }

        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array:");
        // int n=sc.nextInt();
        // int num[]=new int[n];
        // System.out.println("Enter the elements of array:");
        // for(int i=0;i<n;i++){
        //     num[i]=sc.nextInt();
        // }
        //  int[] output=findRunningSum(num,n);
        //  for(int i=0;i<n;i++){
        //     System.out.print(output[i]+" ");
        //  }
        // sc.close();
    }
    
}
