package Arrays.maxsubarray;
import java.util.Scanner;
public class sub {
    public static void maxSubArray(int arr[],int n){
        int max_so_far=Integer.MIN_VALUE;
        int max_end_here=0;
        int start=0;
        int end=0;
        int s=0;

        for(int i=0;i<n;i++){
            max_end_here+=arr[i];

            if(max_so_far<max_end_here){
                max_so_far=max_end_here;
                start=s;
                end=i;
            }

            if(max_end_here<0){
                max_end_here=0;
                s=i+1;
            }
        }

        System.out.println("Maximum sum is:"+max_so_far);
        System.out.println("Start index is:"+start);
        System.out.println("End index is:"+end);
    }
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        maxSubArray(arr,n);

        sc.close();
            
    }
    
}
