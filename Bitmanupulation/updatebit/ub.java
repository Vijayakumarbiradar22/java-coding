package Bitmanupulation.updatebit;
import java.util.Scanner;
public class ub {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the oper:");
        int oper=sc.nextInt(); //if oper is 1 then set and if oper is 0 then clear
        int n=5;
        int pos=2;
        int bitMask=1<<pos;

        if(oper==1){
            int newNumber=bitMask|n;
            System.out.println(newNumber);
        } else {
            int newBitmask=~(bitMask);
            int newNumber=newBitmask&n;
            System.out.println(newNumber);
        }
    }
    
}
