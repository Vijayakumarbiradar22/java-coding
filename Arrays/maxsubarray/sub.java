package Arrays.maxsubarray;
import java.util.Scanner;
public class sub {
    public static void maxSubarraySum(int arr[],int len){
        int max_so_far=Integer.MIN_VALUE;
        int max_end_here=0;
        int start=0;
        int end=0;
        int s = 0;

        for(int i=0;i<len;i++){
            max_end_here =max_end_here+arr[i];
            
            if(max_so_far<max_end_here){
                max_so_far = max_end_here;
                start=s;
                end=i;
            }

            if(max_end_here<0){
                max_end_here=0;
                s=i+1;
            }
        }
        System.out.println("Max sum is:"+max_so_far);
        System.out.println("Starting index="+start);
        System.out.println("Ending index="+end);
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array:");
            int len=sc.nextInt();
            int[] arr = new int[len];
            System.out.println("Enter the elements:");
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }
            //int[] arr = {-2,-3,4,-1,-2,1,5,-3};
            //int len=arr.length;
            maxSubarraySum(arr,len);
        }
    }
    
}
