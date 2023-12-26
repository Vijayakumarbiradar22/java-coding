package Bitmanupulation.reversebit;
import java.util.Scanner;
public class bitrev {
    public static void  main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the n");
        int n=sc.nextInt();
        int result = reverseBit(n);
        System.out.println(result);
         sc.close();
    }
    
}
