package Arrays.medianof2sortedarray;
import java.util.Scanner;
import java.util.Arrays;
public class sortedmedian {
    public static int findMedianSortedArray(int[] nums1,int[] nums2){
        int n1=nums1.length;
        int n2=nums2.length;

        int merged[] = new int[n1+n2];
        int k=0;

        for(int i=0;i<n1;i++){
            merged[k++]=nums1[i];
        }
        for(int i=0;i<n2;i++){
            merged[k++]=nums2[i];
        }

        Arrays.sort(merged);
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array1:");
      int n1=sc.nextInt();
      int[] nums1=new int[n1];
      System.out.println("Enter the elements of array1;");  
      for(int i=0;i<n1;i++){
        nums1[i]=sc.nextInt();
      }
      System.out.println("Enter the size of array2:");
      int n2=sc.nextInt();
      int[] nums2 = new int[n2];
      System.out.println("Enter the elements of array2:");
      for(int i=0;i<n2;i++){
        nums2[i]=sc.nextInt();
      }
      double result = findMedianSortedArray(nums1,nums2);
      System.out.println(result);
      sc.close();
    } 
}
