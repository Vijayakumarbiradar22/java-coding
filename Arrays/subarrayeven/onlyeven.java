package Arrays.subarrayeven;
import java.util.Scanner;
public class onlyeven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        for(int i=0;i<n;i++){
           if(arr[i]%2==0){
            even+=1;
           } 
        }
        int arr1[]=new int[even];
        int x=0;
        for(int i=0;i<n;i++){
           if(arr[i]%2==0){
            arr1[x]=arr[i];
            x++;
           } 
        }
        for(int i=0;i<arr1.length;i++){
          System.out.print(arr1[i]+" ");  
        }
        sc.close();
    }
}
