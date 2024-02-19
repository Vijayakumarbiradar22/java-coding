package Sorting.mergesort;
import java.util.Scanner;
public class merge {
    // It is based on conquer technique
    public static void devide(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }

        int mid=si+(ei-si)/2;
        devide(arr,si,mid);
        devide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }

    public static void conquer(int arr[],int si,int mid,int ei){
        int merged[]=new int[ei-si+1];
        int indx1=si;
        int indx2=mid+1;
        int x=0;

        while(indx1<=mid && indx2<=ei){
            if(arr[indx1]<arr[indx2]){
                merged[x++]=arr[indx1++];
            } else {
                merged[x++]=arr[indx2++];
            }
        }

        while(indx1<=mid){
            merged[x++]=arr[indx1++];
        }

        while(indx2<=ei){
            merged[x++]=arr[indx2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
           arr[j]=merged[i]; 
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        devide(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //System.out.println();
        sc.close();  
    } 
}
