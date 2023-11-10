package Arrays.addition;
import java.util.Scanner;
public class add {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int r=sc.nextInt();
        System.out.println("Enter the no.of cols:");
        int c=sc.nextInt();
        int[][] arr1=new int[r][c];
        int[][] arr2=new int[r][c];
        System.out.println("Enter the array 1:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println(arr1.length);
        System.out.println("Enter the array 2:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println(arr2.length);

        int[][] arr3=new int[3][3];

        System.out.println("Sum of Array is:");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                arr3[i][j]=0;

                for(int k=0;k<arr3.length;k++){
                    arr3[i][j] = arr1[i][j]+arr2[i][j];
                }
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
}
    
}
