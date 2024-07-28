package Strings.reversebywords;
import java.util.Scanner;
public class rev {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str=sc.nextLine();
        String[] ns=str.split(" ");
        String nstr="";
        for(int i=ns.length-1;i>=0;i--){
            nstr+=ns[i]+" ";
        }
        nstr+=" ";
        System.out.println(nstr);
        sc.close();
    }
    
}
