package Arrays.rotate2Dby90;
import java.util.Scanner;
public class matrix2d {
    public static void rotate(int[][] mat){
        //step1 Transpose of matrix:
        int len=mat.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
               int temp=mat[i][j];
               mat[i][j]=mat[j][i];
               mat[j][i]=temp; 
            }
        }
        //step2 Reverse the row
        for(int i=0;i<len;i++){
            int l=0;
            int h=len-1;
            while(l<h){
                int temp=mat[i][l];
                mat[i][l]=mat[i][h];
                mat[i][h]=temp;
                l++;
                h--;
            }
        }
    }
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

        System.out.println("Matrix rotated by 90 degree:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    } 
}
