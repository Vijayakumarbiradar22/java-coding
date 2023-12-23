package Bitmanupulation.bitcount;
import java.util.Scanner;
public class bit {
    public static int countOnes(int n){
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();

        int count=countOnes(n);
        System.out.println(count);


    }
    
}
