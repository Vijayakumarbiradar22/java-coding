package Neetcode.twopointers.containermostwater;
import java.util.Scanner;
public class mostwater {
    public static int maxArea(int heights[]){
        int left=0;
        int right=heights.length-1;
        int maxarea=0;

        
    }
    public static void main(String args[]){
       Scanner sc = new  Scanner(System.in);
       System.out.println("Enter the size of array");
       int n = sc.nextInt();
       int heights[]=new int[n];
       System.out.println("Enter the eleements:");
       for(int i=0;i<n;i++){
        heights[i]=sc.nextInt();
       }

       int result = maxArea(heights);
       System.out.println(result);

    }
    
}
