package Arrays.spiralorder;
import java.util.Scanner;
public class spiral {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the no.of rows:");
        int r=sc.nextInt();
        System.out.println("Enter the no.of cols");
        int c=sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter the element:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("The spiral order is:");
        int rowstart=0;
        int rowend=r-1;
        int colstart=0;
        int colend=c-1;

        while(rowstart<=rowend && colstart<=colend){

            for(int col=colstart;col<=colend;col++){
                System.out.print(mat[rowstart][col]+" ");
            }
            rowstart++;

            for(int row=rowstart;row<=rowend;row++){
                System.out.print(mat[row][colend]+" ");
            }
            colend--;

            for(int col=colend;col>=colstart;col--){
                System.out.print(mat[rowend][col]+" ");
            }
            rowend--;

            for(int row=rowend;row>=rowstart;row--){
                System.out.print(mat[row][colstart]+" ");
            }
            colstart++;

        }
    }



    }
    
}
