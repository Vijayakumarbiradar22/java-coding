package Arrays.medianofarray;
import java.util.Scanner;
public class median {
    public static int getMedian(int arr1[],int arr2[],int n){
        int i=0;
        int j=0;
        int count;
        int m1=-1, m2=-1;

        for(count=0;count<=n;count++){
            if(i==n){
                m1=m2;
                m2=arr2[0];
                break;
            } else if(j==n){
                m1=m2;
                m2=arr1[0];
                break;
            }
            if(arr1[i]<=arr2[j]){
                m1=m2;
                m2=arr1[i];
                i++;
            } else {
                m1=m2;
                m2=arr2[j];
                j++;
            }
        }
        return (m1+m2)/2;
    }
    public static void main(String args[]){
        int[] arr1 = {1,12,15,26,38};
        int[] arr2 = {2,13,17,30,45};

        int n1=arr1.length;
        int n2=arr2.length;

        if(n1==n2){
            System.out.println("Median is:"+ getMedian(arr1,arr2,n1));
        } else{
            System.out.println("Arrays are not equal size");
        }
    }
    
}
