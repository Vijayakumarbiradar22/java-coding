package Neetcode.Stack.dailytemperatures;
import java.util.*;
public class temp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days:");
        int n=sc.nextInt();
        int temperatures[]=new int[n];
        System.out.println("Enter the temperatures:");
        for(int i=0;i<n;i++){
           temperatures[i]=sc.nextInt(); 
        }
        int result[]=DailyTemperature(temperatures);
        for(int i:result){
            System.out.print(result[i]+" ");
        }
        sc.close();
    }
    
}
