package Strings.compare;
import java.util.Scanner;
public class com {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1:");
        String name1=sc.nextLine();
        System.out.println("Enter the string 2:");
        String name2=sc.nextLine();
        if(name1.equals(name2)){
            System.out.println("Strings are same.");
        } else{
           System.out.println("Strings are not same."); 
        }
        sc.close();
    }  
}
