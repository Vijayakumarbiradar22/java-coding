package Recursion.towerofhanoi;
import java.util.Scanner;
public class toh {
    public static void towerofhanoi(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("Transfer the disk"+n+" from "+src+" to "+dest);
            return;
        }
        else{
            towerofhanoi(n-1, src, dest, help);
            System.out.println("Transfer the disk"+n+" from "+src+" to "+dest);
            towerofhanoi(n-1, help, src, dest);
        }
    }
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the total number of discs:");
            int n= sc.nextInt();
            towerofhanoi(n,"S","H","D");
            
            sc.close();

    }
    
}
