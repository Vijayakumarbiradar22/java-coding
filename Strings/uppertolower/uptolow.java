package Strings.uppertolower;
import java.util.Scanner;
public class uptolow {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string:");
            String str = sc.nextLine();
            String res="";
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
                    res+=str.charAt(i)+('a'-'A');
                }
            }
            System.out.println(res);
        }
    }
    
}

// It is not correct updated soon