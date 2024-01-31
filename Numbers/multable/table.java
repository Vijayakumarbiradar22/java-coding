package Numbers.multable;
import java.util.Scanner;
public class table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of multiple table:");
        int n=21;
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    
}
