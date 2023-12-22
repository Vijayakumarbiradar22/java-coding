package Bitmanupulation.numberof1bit;
import java.util.Scanner;
public class hamming {
    public static int hammingWeight(int n){
        return Integer.bitCount(n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bits n:");
        int n=sc.nextInt();
        int res = hammingWeight(n);
        System.out.println(res);
        sc.close();
    }
    
}
