package Arrays.small2d;
import java.util.Scanner;
public class small {
    public static int findMin(int arr[][],int r,int c){
        int min = arr[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of cols:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int result = findMin(arr,r,c);
        System.out.println(result);

        sc.close();
    }
    
}
