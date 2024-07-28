package Strings.compare;
import java.util.Scanner;
public class comp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String str1=sc.nextLine();
        System.out.println("Enter string 2:");
        String str2=sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("Strings are same.");
        } else {
            System.out.println("Strings are not same.");
        }
        sc.close();
    }
    
}
