package Strings.wordbyreverse;
import java.util.Scanner;
public class revword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String ns[] = str.split(" ");
        String nstr="";
        for(int i=ns.length-1;i>=0;i--){
            nstr+=ns[i];
            nstr+=" ";
        }
            System.out.println(nstr);
    }
}
