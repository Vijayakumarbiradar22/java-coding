package Bitmanupulation.bitcount;
import java.util.Scanner;
public class bit {
    public static int countOnes(int n){
      int bitMask=1;
      int count=0; 
      while(bitMask<=n){
        if((n & bitMask)== bitMask){
            count++;
        }
        bitMask = bitMask<<1;
      } 
      return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();

        int count=countOnes(n);
        System.out.println(count);


    }
    
}
