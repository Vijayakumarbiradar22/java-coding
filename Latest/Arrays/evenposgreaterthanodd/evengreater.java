package Arrays.evenposgreaterthanodd;
import java.util.*;
public class evengreater {
    public static void assign(int arr[],int n){
        Arrays.sort(arr);
        int ans[]=new int[n];
        int ptr1=0,ptr2=n-1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=arr[ptr2];
                ptr2--;
            } else {
                ans[i]=arr[ptr1];
                ptr1++;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        assign(arr,n);
        sc.close();
    }
    
}
