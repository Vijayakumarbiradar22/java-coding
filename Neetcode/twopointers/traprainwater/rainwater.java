package Neetcode.twopointers.traprainwater;
import java.util.Scanner;
public class rainwater {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array:");
      int n = sc.nextInt();
      int heights[] = new int[n];
      System.out.println("Enter the elements:");
      for(int i=0;i<n;i++){
        heights[i]=sc.nextInt();
      }  
      int result=trap(heights);
      System.out.println(result);
      sc.close();
    }
    
}
