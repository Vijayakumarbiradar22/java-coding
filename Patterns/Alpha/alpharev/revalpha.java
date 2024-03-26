package Patterns.Alpha.alpharev;
import java.util.Scanner;
public class revalpha {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows:");
       int rows=sc.nextInt();
       char ch='A';
       for(int i=0;i<rows;i++){
        for(int j=0;j<2*rows-1;j++){
            System.out.print(ch);
            
        }
       }


       sc.close();
    }
}
