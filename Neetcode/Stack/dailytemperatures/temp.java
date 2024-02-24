package Neetcode.Stack.dailytemperatures;
import java.util.*;
public class temp {
    public static int[] DailyTemperature(int[] temperatures){
        int[] results = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return results;
    }
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
