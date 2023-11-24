package Arrays.multiplication;
import java.util.Scanner;
public class multi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows and cols in mat1:");
        int R1=sc.nextInt();
        int C1=sc.nextInt();
        System.out.println("Enter the no.of rows and cols in mat2:");
        int R2=sc.nextInt();
        int C2=sc.nextInt();
        int mat1[][]=new int[R1][C1];
        int mat2[][]=new int[R2][C2];
         int res[][]=new int[R1][C2];
        System.out.println("Enter the elements of mat1:");
        for(int i=0;i<R1;i++){
            for(int j=0;j<C1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of mat2:");
        for(int i=0;i<R2;i++){
            for(int j=0;j<C2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }

        if(C1!=R2){
            System.out.println("Matrices cannot be multiplied.");
        }
       
        System.out.println("Multiplication of matrix is:");
        for(int i=0;i<R1;i++){
        for(int j=0;j<C2;j++){
            for(int k=0;k<R2;k++){
                res[i][j]+=mat1[i][k]*mat2[k][j];
            }
            System.out.print(res[i][j]+" ");
        }
        System.out.println();
       }
        sc.close();
    }
    
}
