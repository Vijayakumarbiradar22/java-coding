package Recursion.stringreverse;
import java.util.Scanner;
public class revstr {
    public static void printRev(String str,int indx){
        if(indx==0){
            System.out.print(str.charAt(indx));
            return;
        }

        System.out.print(str.charAt(indx));
        printRev(str, indx-1);
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string:");
            String str = sc.nextLine();
            printRev(str,str.length()-1);
        }
    }
    
}
