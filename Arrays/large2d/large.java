package Arrays.large2d;
import java.util.Scanner;
public class large {
   
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows:");
            int r=sc.nextInt();
            System.out.println("Enter the number of cols:");
            int c=sc.nextInt();
            int[][] arr = new int[r][c];
            System.out.println("Enter the array elements:");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    arr[r][c]=sc.nextInt();
                }
            }

            
    }
    
}
