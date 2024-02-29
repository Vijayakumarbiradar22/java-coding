package Arrays.rotate2Dby90;
import java.util.Scanner;
public class matrix2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("Enter the number of cols:");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        rotate(mat);

        
        for(int i=0;i<r;i++){
            for(int j=0;i<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
