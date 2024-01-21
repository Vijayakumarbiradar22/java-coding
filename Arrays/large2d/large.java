package Arrays.large2d;
import java.util.Scanner;
public class large {public static int findLargest(int[][] arr,int r, int c){
    int max = arr[0][0];

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(arr[i][j]>max){
                max=arr[r][c];
            }
        }
    }
    return max;
}
   
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows:");
            int r=sc.nextInt();
            System.out.println("Enter the number of cols:");
            int c=sc.nextInt();
            int[][] arr = new int[r][c];
            System.out.println("Enter the array elements:");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    arr[i][j]=sc.nextInt();
                }
            }

            int result = findLargest(arr,r,c);
            System.out.println(result);

            sc.close();
    }
    
}
