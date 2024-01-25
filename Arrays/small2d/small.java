package Arrays.small2d;
import java.util.Scanner;
public class small {
    // public static int findmin(int[][] arr,int r, int c){
    //     int min=arr[0][0];
    //     for(int i=0;i<r;i++){
    //         for(int j=0;j<c;j++){
    //             if(arr[i][j]<min){
    //                 min=arr[i][j];
    //             }
    //         }
    //     }
    //     return min;
    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter the number of cols:");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        
        // int[][] arr = {{3,2,7},{4,6,5}};
        // int r=2,c=3;
        // int result = findmin(arr,r,c);
        // System.out.println(result);
    }
    
}
