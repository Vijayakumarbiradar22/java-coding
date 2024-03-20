package Arrays.arrayunion;
import java.util.Scanner;
import java.util.*;
public class union {
    public static ArrayList<Integer> Unionarray(int arr1[],int arr2[],int size1,int size2){
       TreeSet<Integer> set = new TreeSet<>();
       
       for(int i:arr1){
        set.add(i);
       }

       for(int i:arr2){
        set.add(i);
       }

       ArrayList<Integer> list = new ArrayList<>();

       for(int i:set){
        list.add(i);
       }

       return list;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array1:");
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        System.out.println("Enter elements of array1:");
        for(int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Ente size of array2:");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Enter the elements of array2:");
        for(int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }

        System.out.println("Union of array1 and array2:");
        ArrayList<Integer> uni = Unionarray(arr1,arr2,size1,size2);
        for(int i:uni){
            System.out.print(i+" ");
            sc.close();
        }
    }
    
}

//test for output
//input array1  {1,2,2,3,3,3}
// array2 {2,3,3,4,5,5}