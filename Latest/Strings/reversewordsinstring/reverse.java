package Strings.reversewordsinstring;
import java.util.Scanner;
public class reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence?:");
        String str=sc.nextLine();
        String[] ns=str.split(" ");
        String nstr="";
        for(int i=0;i<ns.length;i++){
            for(int j=ns[i].length()-1;j>=0;j--){
                nstr+=ns[i].charAt(j);
            }
            nstr=nstr+" ";
        }
        System.out.println(nstr);
        sc.close();
    }
    
}
