package Numbers.leapyear;
import java.util.Scanner;
public class leap {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Year:");
            int year = sc.nextInt();
            if(year%4==0 && year%100!=0 || year%400==0){
                System.out.println("Leap year");
            } else {
                System.out.println("Not leap year.");
            }
            sc.close();
        }
    }
    

