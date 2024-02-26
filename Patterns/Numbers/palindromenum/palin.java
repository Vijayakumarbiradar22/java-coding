package Patterns.Numbers.palindromenum;
import java.util.Scanner;
public class palin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows:");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int s=1;s<=n-i;s++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            sc.close();
        }
    }