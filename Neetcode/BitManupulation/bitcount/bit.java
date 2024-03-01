package Neetcode.BitManupulation.bitcount;
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
        System.out.println("Enter the number for bitcount:");
        int n= sc.nextInt();

        int count=countOnes(n);
        System.out.println(count);

        int ans[]=new int[n+1];
        for(int i=0;i<ans.length;i++){
            ans[i]=countOnes(i);
        }
        System.out.println(ans);

        sc.close();
    }
    
}

//pending for modification