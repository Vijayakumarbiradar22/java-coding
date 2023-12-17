package Neetcode.ArraysandHashing.validsoduku;
import java.util.Scanner;
public class soduku {
    // public static boolean isValidSoduku(char[][] board){

    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows:");
        int r=sc.nextInt();
        System.out.println("Enter the columns:");
        int c = sc.nextInt();
        int[][] board=new int[r][c];
        System.out.println("Enter the soduku matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                board[i][j]=sc.nextInt();
            }
        }
        // isValidSoduku(board);
    }
    
}
