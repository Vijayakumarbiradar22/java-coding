package Numbersystem.binarytodecimal;
import java.util.Scanner;
public class btod {
    public static int convertToDecimal(String binary){
        int dec = 0;
        int length = binary.length();

        for(int i=0;i<length;i++){
            int digit = binary.charAt(i)-'0';
            dec += digit * Math.pow(2,length-1-i);
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        String binary = sc.nextLine();
        // String binary = "1011";
        int decimalNumber = convertToDecimal(binary);
        System.out.println(decimalNumber);
    }
    
}
