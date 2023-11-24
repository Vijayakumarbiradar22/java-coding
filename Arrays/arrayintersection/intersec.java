package Arrays.arrayintersection;
import java.util.Scanner;
import java.util.*;
public class intersec {
    public static ArrayList<Integer> findIntersection(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int num:arr1){
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int num:arr2){
            if(set.contains(num)){
                result.add(num);
                set.remove(num);
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        System.out.println("Enter the elements of array1:");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the size of array2:");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Enter the elements of array2:");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> intersection=findIntersection(arr1,arr2);
        for(int i:intersection){
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
