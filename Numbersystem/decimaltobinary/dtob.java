package Numbersystem.decimaltobinary;
import java.util.Scanner;
public class dtob {
    public static String convertBinary(int num){
        StringBuilder sb = new StringBuilder();
        while(num>0){
            int rem = num%2;
            sb.insert(0,rem);
            num=num/2;
        }
        return sb.toString();
    }
    public static void main(String args[]){
        int num=11;
        String binary = convertBinary(num);
        System.out.println(binary);
    }
    
}
