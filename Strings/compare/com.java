package Strings.compare;
import java.util.Scanner;
public class com {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        System.out.println("Enter  second string:");
        String name1="vijay";
        String name2="vijay";

        //do not use "==" for compare some code like following gives wrong result
         //if(new String("vijay")==new String("vijay")){

        if(name1.equals(name2)){
            System.out.println("Strings are same");
        } else {
            System.out.println("Strings are not same");
        }
    }
    
}
