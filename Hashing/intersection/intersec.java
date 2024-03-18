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
        // int arr1[]={7,3,9};
        // int arr2[]={6,3,9,2,9,4};
        System.out.println(findIntersec(arr1,arr2));
        sc.close();
    }
    
}
