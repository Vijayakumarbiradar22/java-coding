package Arrays.arrayunion;
import java.util.*;
public class union {
    public static ArrayList<Integer> unionArray(int[] arr1,int[] arr2,int s1,int s2){
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:arr1){
            set.add(i);
        }

        for(int i:arr2){
            set.add(i);
        }
        ArrayList<Integer> result=new ArrayList<>();

        for(int i:set){
            result.add(i);
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1:");
        int s1=sc.nextInt();
        int[] arr1=new int[s1];
        System.out.println("Enter the elements of array1:");
        for(int i=0;i<s1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the size of array2:");
        int s2=sc.nextInt();
        int[] arr2=new int[s2];
        System.out.println("Enter the elements of array2:");
        for(int i=0;i<s1;i++){
            arr2[i]=sc.nextInt();
        }

        ArrayList<Integer> uni=unionArray(arr1,arr2,s1,s2);
        for(int i:uni){
            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
