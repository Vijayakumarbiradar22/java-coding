package Arrays.recordday;
import java.util.Scanner;
public class rec {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int array[]=new int[n+1];
        array[n]=-1;
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        if(n==1){
            System.out.println("1");
        }

        int ans=0;
        int mx=-1;

        for(int i=0;i<n;i++){
            if(array[i]>mx && array[i]>array[i+1]){
                ans++;
            }
            mx=Integer.max(mx, array[i]);
        }
        System.out.println(ans);

        sc.close();
    }
    
}
