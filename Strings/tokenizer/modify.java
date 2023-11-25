package Strings.tokenizer;
import java.util.Scanner;
import java.util.StringTokenizer;
public class modify {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String delim = " ";

        StringTokenizer st = new StringTokenizer(str,delim);

        int count=st.countTokens();
        System.out.println("Number of tokens are:"+count);

        for(int i=0;i<count;i++){
            System.out.println("Token at "+i+" is:"+st.nextToken());
        }

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        sc.close();
    }
    
}
