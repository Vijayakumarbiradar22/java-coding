package Arrays.transpose;
import java.util.Scanner;
public class trans {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows:");
       int r=sc.nextInt();
       System.out.println("Enter the number of columns:");
       int c=sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose of matrix is:");

        for(int i=0;i<r;i++){
            
        }
    }
    
}
