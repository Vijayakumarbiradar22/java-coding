package Neetcode.mathandgeometry.multiplynumber;
import java.util.*;
public class multiply {
    public static String multiplyString(String num1,String num2){
        int n1 = num1.length();
        int n2 = num2.length();
    int[] pos = new int[n1 + n2];
   
    for(int i = n1 - 1; i >= 0; i--) {
        for(int j = n2 - 1; j >= 0; j--) {
            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
            int p1 = i + j; 
            int p2 = i + j + 1;
            int sum = mul + pos[p2];

            pos[p1] += sum / 10;
            pos[p2] = (sum) % 10;
        }
    }  
    StringBuilder sb = new StringBuilder();
    for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
    return sb.length() == 0 ? "0" : sb.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String1:");
        String num1=sc.nextLine();
        System.out.println("Enter the String2:");
        String num2=sc.nextLine();
        String result = multiplyString(num1,num2);
        System.out.println(result);
        sc.close();
    } 
}
