package Strings.movextoend;
import java.util.*;
public class movex {
    public static void movexEnd(String str){
        int count=0;
        String nstr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='x'){
                count++;
            } else {
                nstr+=str.charAt(i);
            }
        }
        for(int i=0;i<count;i++){
            nstr+='x';
        }
        System.out.println(nstr);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        movexEnd(str);
        sc.close();
    }
    
}
