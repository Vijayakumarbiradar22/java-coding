package Strings.tokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;
public class token {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string1:");
        String str=sc.nextLine();

        StringTokenizer st1 = new StringTokenizer(str," ");

        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }

            System.out.println("Enter the String2:");
            String str2=sc.nextLine();
        StringTokenizer st2 = new StringTokenizer(str2,":");

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }

        sc.close();
    }
    
}
