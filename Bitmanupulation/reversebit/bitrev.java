package Bitmanupulation.reversebit;
import java.util.Scanner;
public class bitrev {
    public static int reverseBit(int n){
        int ans=0;
        for(int i=0;i<32;i++){
            ans<<=1;
            ans |=(n&1);
            n>>=1;
        }
        return ans;
    }
    public static void  main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the n");
        int n=sc.nextInt();
        int result = reverseBit(n);
        System.out.println(result);
         sc.close();
    }
    
}
