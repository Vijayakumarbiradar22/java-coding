package Arrays.mergesortedarray;
import java.util.*;
public class mergesorted {
    public static void mergeArray(int arr1[],int arr2[],int m,int n){
        for(int j=0,i=3;j<n;j++) {
            arr1[i]=arr2[j];
            i++;
        }
        Arrays.sort(arr1);

        System.out.println("Sorted array1 is:");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arr1:");
        int m=sc.nextInt();
        int arr1[]=new int[m];
        System.out.println("Enter the elements of arr1:");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        } 
        System.out.println("Enter the size of arr2:");
        int n=sc.nextInt();
        int arr2[]=new  int[n];
        System.out.println("Enter the elements of arr2:");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        mergeArray(arr1,arr2,m,n);
        sc.close();
    }
    
}
