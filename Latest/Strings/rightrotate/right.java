package Strings.rightrotate;
import java.util.*; 
public class right {
    public static String rightRotate(String str,int rt){
        int len = str.length();
        rt = rt % len;  
        String ans = str.substring(len - rt) + str.substring(0, len - rt);
        return ans;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter th erotation times:");
        int rt=sc.nextInt();
        System.out.println(rightRotate(str,rt));
        sc.close();
    }
    
}
