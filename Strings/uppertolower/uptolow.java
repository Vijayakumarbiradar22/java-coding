package Strings.uppertolower;
import java.util.Scanner;
public class uptolow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter String in Uppercase:");
            String str = sc.nextLine();
            String res="";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                    res+=str.charAt(i)+('a'-'A');
                }
            }
            System.out.println(res);
            sc.close();
        
        
    }
    
}

// It is not correct updated soon