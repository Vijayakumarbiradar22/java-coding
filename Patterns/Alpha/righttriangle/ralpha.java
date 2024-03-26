package Patterns.Alpha.righttriangle;
import java.util.Scanner;
public class ralpha {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        char chr='E';

        for(char i='A';i<=chr;i++){
            for(char s='A';s<=chr-i;s++){
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
