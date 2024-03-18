package Hashing.unionofarray;
import java.util.*;
public class union {
    public static int findUnion(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        return set.size();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int n1=sc.nextInt();
        System.out.println("Enter the size of array2:");
        int n2=sc.nextInt();
        

        // int arr1[]={7,3,9};
        // int arr2[]={6,3,9,2,9,4};
        System.out.println(findUnion(arr1,arr2));
    }   
    
}
