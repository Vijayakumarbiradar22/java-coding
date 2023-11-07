package Arrays.large2d;
import java.util.Scanner;
public class large {
    public static int findLargest(int[][] arr,int r,int c){
        int max=arr[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            } 
        }
        return max;

    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows:");
            int r=sc.nextInt();
            System.out.println("Enter the number of columns:");
            int c = sc.nextInt();
            int[][] arr = new int[r][c];
            System.out.println("Enter the elements:");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int result = findLargest(arr,r,c);
            System.out.println("The 2D Array is:");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            System.out.println(result);
        }
    }
    
}
