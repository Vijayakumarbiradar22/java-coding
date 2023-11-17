package Strings.reversebyword;
import java.util.Scanner;
public class revbyword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str=sc.nextLine();
            String ns[]=str.split(" ");
            String nstr="";

            for(int i=0;i<ns.length;i++){
                for(int j=ns[i].length()-1;j>=0;j--){
                    nstr+=ns[i].charAt(j);
                }
                nstr+=" ";
            }
            System.out.println(nstr);
        sc.close();
    }
    
}
