package Arrays.multiplication;
import java.util.*;
public class multi {
    public static void matMul(int[][] mat1,int[][] mat2,int R1,int C1,int R2,int C2){
        int[][] res=new int[R1][C2];
        for(int i=0;i<R1;i++){
            for(int j=0;j<C2;j++){
                for(int k=0;k<R2;k++){
                    res[i][j]+=mat1[i][k]*mat2[k][j];
                }
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and cols of mat1:");
        int R1=sc.nextInt();
        int C1=sc.nextInt();
        int[][] mat1=new int[R1][C1];
        System.out.println("Enter the values of mat1:");
        for(int i=0;i<R1;i++){
            for(int j=0;j<C1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the rows and cols of mat2:");
        int R2=sc.nextInt();
        int C2=sc.nextInt();
        int[][] mat2=new int[R2][C2];
        System.out.println("Enter the values of mat2:");
        for(int i=0;i<R2;i++){
            for(int j=0;j<C2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        if(C1!=R2){
            System.out.println("Not possible");
        } else {
            matMul(mat1,mat2,R1,C1,R2,C2);
        }
        sc.close();
    }
    
}
