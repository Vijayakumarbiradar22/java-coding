package Hashing.intersection;
import java.util.*;
public class intersec {
    public static int findIntersec(int arr1[],int arr2[]){
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
              count++;
              set.remove(arr2[j]);  
            }
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        System.out.println("Enter the elements of array1");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array2:");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("Enter the elements of array2:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println(findIntersec(arr1,arr2));
        sc.close();
    }
    
}
