package Arrays.betweenrange;
import java.util.Scanner;
public class nums {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the:");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the element:");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("Enter the start index:");
       int start=sc.nextInt();
       System.out.println("Enter the end index:");
       int end=sc.nextInt();

       int count=0;
       for(int i=0;i<n;i++){
        if(arr[i]>=start && arr[i]<=end){
            count+=1;
            System.out.print(arr[i]+" ");
        }
       }
       System.out.println();

       if(count>0){
        System.out.println(count+" numbers available");
       } else {
        System.out.println("No numbers available");
       }
        sc.close();
    }
    
}
