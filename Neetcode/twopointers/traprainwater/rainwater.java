package Neetcode.twopointers.traprainwater;
import java.util.Scanner;
public class rainwater {
    public static int trapWater(int[] heights){
        int n=heights.length;
        int[] lmax=new int[n];
        int[] rmax=new int[n];
        lmax[0]=heights[0];
        rmax[n-1]=heights[n-1];

        for(int i=1;i<n;i++){
            lmax[i]=Integer.max(lmax[i-1],heights[i]);
        }

        for(int i=n-2;i>=0;i--){
            rmax[i]=Integer.max(rmax[i+1],heights[i]);
        }

        int sum=0;

        for(int i=1;i<n;i++){
            sum+=Integer.min(rmax[i],lmax[i])-heights[i];
        }
        return sum;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size:");
      int n = sc.nextInt();
      int heights[] = new int[n];
      System.out.println("Enter the elements:");
      for(int i=0;i<n;i++){
        heights[i]=sc.nextInt();
      }  
      int result=trapWater(heights);
      System.out.println(result);
      sc.close();
    }
    
}

//output
//height = [0,1,0,2,1,0,1,3,2,1,2,1]
