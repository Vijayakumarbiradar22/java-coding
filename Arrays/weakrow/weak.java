package Arrays.weakrow;
import java.util.Scanner;
public class weak {
    public static void findWeakRow(int mat[][],int r,int c){
        int counter =999;
        for(int i=0;i<r;i++){
            int count=0;
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    count++;
                }
            }
                if(count<counter){
                    counter=count;
                }
            
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int r=sc.nextInt();
        System.out.println("Enter the no.of cols:");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        findWeakRow(mat,r,c);
        sc.close();
    }
    
}
