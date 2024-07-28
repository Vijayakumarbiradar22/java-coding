package Arrays.productofarrayexceptself;
import java.util.*;
public class product {
    public static int[] printProduct(int[] nums, int n){
        int prefixProduct=1;
        int suffixProduct=1;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=prefixProduct;
            prefixProduct*=nums[i];
        }

        for(int i=n-1;i>=0;i--){
            res[i]*=suffixProduct;
            suffixProduct*=nums[i];
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] result=printProduct(nums,n);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }

        sc.close();
    }
    
}
