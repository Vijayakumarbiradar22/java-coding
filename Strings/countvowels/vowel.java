package Strings.countvowels;
import java.util.Scanner;
public class vowel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.toLowerCase().charAt(i)=='a' ||
            str.toLowerCase().charAt(i)=='e' ||
            str.toLowerCase().charAt(i)=='i' ||
            str.toLowerCase().charAt(i)=='o' ||
            str.toLowerCase().charAt(i)=='u'){
                if(str.charAt(i)!=' '){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
    
}
