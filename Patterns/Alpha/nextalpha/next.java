package Patterns.Alpha.nextalpha;
import java.util.Scanner;
public class next {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the end character:");
        char ch='E';
        for(char i='A';i<=ch;i++){
            for(int s=1;s<=ch-i;s++){
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        }
    }
    

