package Strings;
import java.util.Scanner;
import java.util.StringTokenizer;
public class token {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();

        StringTokenizer st1 = new StringTokenizer(str," ");

        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
        sc.close();
    }
    
}
