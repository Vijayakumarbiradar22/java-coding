package Arrays.addition;
import java.util.*;
public class add {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int r=sc.nextInt();
        System.out.println("Enter the no.of cols:");
        int c=sc.nextInt();
        int[][] mat1=new int[r][c];
        int[][] mat2=new int[r][c];
        System.out.println("Enter the matrix1 values:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the matrix1 values:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        int[][] mat3=new int[mat1.length][mat2.length];
        System.out.println("Addition of matrix is:");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2.length;j++){
                mat3[i][j]=0;

                for(int k=0;k<mat3.length;k++){
                    mat3[i][j]=mat1[i][j]+mat2[i][j];
                }
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
            sc.close();
        }
        

    }
    
}
