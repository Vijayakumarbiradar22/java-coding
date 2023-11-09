package Arrays.antispiral;
import java.util.Scanner;
public class anti {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int r=sc.nextInt();
        System.out.println("Enter the no.of cols");
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter the elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Anti spiral order is:");


    }
    
}
